<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div id="footer" class="bigBox">
    <div class="box">

        @{
            int flag = 1;
            foreach (HelpInfo info in WorkContext.HelpList)
            {
                if (info.Pid != 0)
                {
                    if (info.Url.Length == 0)
                    {
                        <a href="@Url.Action("question", "help", new RouteValueDictionary { { "id", info.Id } })">@info.Title</a>
                    }
                    else
                    {
                        <a href="@info.Url">@info.Title</a>
                    }
                }
                else
                {
                    if (flag != 1)
                    {
                        @:</div>
                    }
                    @:<div class="footerBox">
                    <h3>@info.Title</h3>
                    flag++;
                }
            }
            if (WorkContext.HelpList.Count > 0)
            {
                @:</div>
            }
        }

        <div class="clear"></div>
    </div>
    <div class="bigBox footerB">
        <div id="footerB">
            <div class="links">
                @foreach (FriendLinkInfo info in WorkContext.FriendLinkList)
                {
                    <a href="@info.Url" target="@info.Target" title="@info.Title">@info.Name</a> @:|
        }
            </div>
            <div>石家庄蝶影软件开发有限公司 程序版本 @WorkContext.MallVersion 版权所有 @WorkContext.MallCopyright</div>
        </div>
    </div>
    </div>
    @Html.Raw(WorkContext.ExecuteDetail)
    @Html.Raw(WorkContext.MallConfig.Script)