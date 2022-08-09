// tab切换
function setTab(name, cursel, n) {
    for (i = 1; i <= n; i++) {
        var menu = document.getElementById(name + i);
        var con = document.getElementById("con_" + name + "_" + i);
        menu.className = i == cursel ? "cur": "";
        con.style.display = i == cursel ? "block": "none";
    }
}

// tab切换
function countTab(name, cursel, n) {
    for (i = 1; i <= n; i++) {
        var menu = document.getElementById(name + i);
        var con = document.getElementById("con_" + name + "_" + i);
        menu.className = i == cursel ? "cur": "";
        con.style.display = i == cursel ? "inline": "none";
    }
}

//点击弹出对象，获取对应ID
function ShowBox(zoomDisplay) {
    if (document.getElementById(zoomDisplay).style.display != "block") {
        document.getElementById(zoomDisplay).style.display = "block";
    } else {
        document.getElementById(zoomDisplay).style.display = "none";
    }
}

//关闭弹出层
function CloseBox(zoomDisplay) {
    document.getElementById(zoomDisplay).style.display = "none";
}

function ShowSection(zoomDisplay) {
    $("#" + zoomDisplay).addClass('show');
    $("#tips" + zoomDisplay).addClass('show');
    $("#app" + zoomDisplay).removeClass("show");
}
