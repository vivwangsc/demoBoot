<#import "m1.ftl" as my>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title wsc</title>
</head>
<body>
abc123456<br>
${user}
</body>
<div>
    <#list users as us>
        ${us.id}  ${us.email!}  <#if us.loginName == "wsc">加油2019</#if>
        <@ss.wsc us.email,us.id></@ss.wsc>
        <@ss.wsc us.email,us.id></@ss.wsc>
        <br>
    </#list>
</div>

</html>