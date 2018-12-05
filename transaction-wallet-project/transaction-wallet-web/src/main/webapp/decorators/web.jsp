<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/common/taglib.jsp"%>
<html lang="en" class="gr__spectrocoin_com">

<script type="text/javascript" async="" src="<c:url value='/template/web/index_files/tracking.js.download' />"></script><script type="text/javascript" async="" src="./index_files/s.js.download"></script>
<script async="" src="<c:url value='/template/web/index_files/uwt.js.download' />"></script>
<script type="text/javascript" async="" src="<c:url value='/template/web/index_files/linkid.js.download' />"></script>
<script async="" src="<c:url value='/template/web/index_files/analytics.js.download' />"></script>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Account | SpectroCoin</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="copyright" content="Spectro Finance Ltd">
    <meta name="keywords" content="Account">
    <meta property="og:title" content="Account">
    <meta name="twitter:title" content="Account">
    <meta property="og:description" content="account">
    <meta name="twitter:description" content="account">
    <meta property="fb:app_id" content="573273662814660">
    <meta property="og:site_name" content="SpectroCoin">
    <meta property="og:type" content="website">
    <meta property="og:url" content="https://spectrocoin.com/en/account.html" id="og-url">
    <meta property="og:image" content="https://d1ryrugmrhsb54.cloudfront.net/images/og/spectrocoin.png">
    <meta property="og:image:type" content="image/png">
    <meta property="og:image:width" content="1200">
    <meta property="og:image:height" content="630">
    <meta name="twitter:card" content="summary_large_image">
    <meta name="twitter:site" content="@SpectroCoin">
    <meta name="twitter:app:id:iphone" content="923696089">
    <meta name="twitter:app:id:ipad" content="923696089">
    <meta name="twitter:app:id:googleplay" content="lt.spectrofinance.spectrocoin.android.wallet">
    <meta name="twitter:image" content="https://d1ryrugmrhsb54.cloudfront.net/images/og/spectrocoin_twitter.png">
    <meta name="twitter:image:width" content="626">
    <meta name="twitter:image:height" content="335">
    <meta name="theme-color" content="#204d6a">
    <link rel="apple-touch-icon-precomposed" sizes="57x57" href="https://d1ryrugmrhsb54.cloudfront.net/images/logo/57x57.png">
    <link rel="apple-touch-icon-precomposed" sizes="76x76" href="https://d1ryrugmrhsb54.cloudfront.net/images/logo/76x76.png">
    <script>
        if(/Android|webOS|iPhone|iPad|iPod|BlackBerry|BB|PlayBook|IEMobile|Windows Phone|Kindle|Silk|Opera Mini/i.test(navigator.userAgent)) {
            document.querySelector('meta[name="twitter:card"]').setAttribute("content", "app");
        }
    </script>
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="https://d1ryrugmrhsb54.cloudfront.net/images/logo/114x114.png">
    <link rel="apple-touch-icon-precomposed" sizes="120x120" href="https://d1ryrugmrhsb54.cloudfront.net/images/logo/120x120.png">
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="https://d1ryrugmrhsb54.cloudfront.net/images/logo/144x144.png">
    <link rel="apple-touch-icon-precomposed" sizes="152x152" href="https://d1ryrugmrhsb54.cloudfront.net/images/logo/152x152.png">
    <link rel="apple-touch-icon" sizes="57x57" href="https://d1ryrugmrhsb54.cloudfront.net/images/logo/57x57.png">
    <link rel="apple-touch-icon" sizes="76x76" href="https://d1ryrugmrhsb54.cloudfront.net/images/logo/76x76.png">
    <link rel="apple-touch-icon" sizes="114x114" href="https://d1ryrugmrhsb54.cloudfront.net/images/logo/114x114.png">
    <link rel="apple-touch-icon" sizes="120x120" href="https://d1ryrugmrhsb54.cloudfront.net/images/logo/120x120.png">
    <link rel="apple-touch-icon" sizes="144x144" href="https://d1ryrugmrhsb54.cloudfront.net/images/logo/144x144.png">
    <link rel="apple-touch-icon" sizes="152x152" href="https://d1ryrugmrhsb54.cloudfront.net/images/logo/152x152.png">
    <link rel="apple-touch-startup-image" sizes="320x460" href="https://d1ryrugmrhsb54.cloudfront.net/images/logo/320x460.png">
    <link rel="apple-touch-startup-image" sizes="640x920" href="https://d1ryrugmrhsb54.cloudfront.net/images/logo/640x920.png">
    <link rel="apple-touch-startup-image" sizes="640x1096" href="https://d1ryrugmrhsb54.cloudfront.net/images/logo/640x1096.png">
    <link rel="apple-touch-startup-image" sizes="748x1024" href="https://d1ryrugmrhsb54.cloudfront.net/images/logo/748x1024.png">
    <link rel="apple-touch-startup-image" sizes="768x1004" href="https://d1ryrugmrhsb54.cloudfront.net/images/logo/768x1004.png">
    <link rel="apple-touch-startup-image" sizes="1024x748" href="https://d1ryrugmrhsb54.cloudfront.net/images/logo/1024x748.png">
    <link rel="apple-touch-startup-image" sizes="1536x2008" href="https://d1ryrugmrhsb54.cloudfront.net/images/logo/1536x2008.png">
    <link rel="apple-touch-startup-image" sizes="2048x1496" href="https://d1ryrugmrhsb54.cloudfront.net/images/logo/2048x1496.png">
    <link rel="mask-icon" href="https://spectrocoin.com/vassets/images/e1fbc0da1e939a7392562377f3dfce56-mask-logo.svg" color="#1F4D6A">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <link rel="stylesheet" href="<c:url value='/template/web/index_files/dd62c0b93a7796b14aefb821b8202f1e-main.css' />">
    <script src="<c:url value='/template/web/index_files/19fce9d28c5ed6b866d575f4a08f6bdd-main.js.download' />"></script>

    <link rel="shortcut icon" type="image/png" href="https://spectrocoin.com/vassets/images/f0d7b0206b4b8d4d3d9a257fe1d86f32-favico.png">
    <script>
        if (/MSIE 10/i.test(navigator.userAgent) || /MSIE 9/i.test(navigator.userAgent) || /rv:11.0/i.test(navigator.userAgent) ) {
            document.write('<link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300italic,400,400italic,600,600italic,700,700italic,800,800italic&subset=latin,latin-ext,cyrillic" rel="stylesheet">')
        }
    </script>
    <script async="" src="<c:url value='/template/web/index_files/hotjar-943453.js.download' />"></script>
    <script async="" src="<c:url value='/template/web/index_files/modules-f8a1e283f65f251ee5a9c2c382e49726.js.download' />"></script>
    <style type="text/css">iframe#_hjRemoteVarsFrame {display: none !important; width: 1px !important; height: 1px !important; opacity: 0 !important; pointer-events: none !important;}</style>
    <style type="text/css">#dpmaxz_fbm_gui *, #dpmaxz_fbm_gui *:after, #dpmaxz_fbm_gui *:before,#dpmaxz_fbi_root *, #dpmaxz_fbi_root *:after, #dpmaxz_fbi_root *:before{margin: 0;padding: 0;box-sizing: content-box; width: auto;}.dpmaxz_hidden {visibility: hidden;}#dpmaxz_fbm_gui {position: static; -moz-user-select: none;-webkit-user-select: none; margin: 0;padding: 0;cursor: default;}#dpmaxz_fbi_root {-webkit-user-select: none; position: relative; display: inline-block; z-index: 2147483646; margin: 0;padding: 0;}#dpmaxz_fbi_root .dpmaxz_fbi_mainbkg { display: block;position: absolute;cursor: default;width: 50px;height: 24px;background: transparent url(chrome-extension://pkdnjfgdoolnmiacpdamadcneoblphbj/images/mainbkg.png) no-repeat;}#dpmaxz_fbi_root .dpmaxz_fbi_mainbkg .dpmaxz_fbi_fbishield {float: left;margin: -16px 0 0 3px;  padding: 0;background: transparent url(chrome-extension://pkdnjfgdoolnmiacpdamadcneoblphbj/images/mainimg.png) no-repeat;}#dpmaxz_fbi_root .dpmaxz_fbi_mainbkg .dpmaxz_fbi_authok {background: transparent url(chrome-extension://pkdnjfgdoolnmiacpdamadcneoblphbj/images/mainimg_ok.png) no-repeat;}#dpmaxz_fbi_root .dpmaxz_fbi_mainbkg .dpmaxz_fbi_authno {background: transparent url(chrome-extension://pkdnjfgdoolnmiacpdamadcneoblphbj/images/mainimg_no.png) no-repeat;}#dpmaxz_fbi_root .dpmaxz_fbi_mainbkg .dpmaxz_fbi_xchg {background: transparent url(chrome-extension://pkdnjfgdoolnmiacpdamadcneoblphbj/images/mainxchg.png) no-repeat;}#dpmaxz_fbi_root .dpmaxz_fbi_mainbkg .dpmaxz_fbi_menuact {background: transparent url(chrome-extension://pkdnjfgdoolnmiacpdamadcneoblphbj/images/mainmact.png) no-repeat;}#dpmaxz_fbi_root .dpmaxz_fbi_mainbkg .dpmaxz_fbi_add {height: 16px;width: 15px;float: right;background: transparent url(chrome-extension://pkdnjfgdoolnmiacpdamadcneoblphbj/images/mainadd.png) no-repeat;margin: 0 -16px 0 0;}#dpmaxz_fbm_gui .dpmaxz_fbm_menus {position: absolute; z-index: 2147483647;}.dpmaxz_fbm_menusrel {position: relative;}#dpmaxz_fbm_gui .dpmaxz_fbm_menus ul {position: absolute; left: 0;top: 22px; list-style: none;white-space: nowrap;border: 1px solid #a0a0a0;background-image: -moz-linear-gradient(top, rgb(240,245,255) 73%, white 100%); background-image: -webkit-linear-gradient(top, rgb(240,245,255) 73%, white 100%);box-shadow: 4px 4px 4px -3px #605F70;font-family: 'Segoe UI',Verdana,Arial;font-style: normal;font-size: 1em;padding: 3px 3px;margin: 2px 4px 2px 4px;}#dpmaxz_fbm_gui .dpmaxz_fbm_menus ul li {text-decoration: none;text-align: left;margin: 0; padding: 0;list-style: none;}#dpmaxz_fbm_gui .dpmaxz_fbm_menus ul li:hover {border: 1px solid #aecff7;-webkit-border-radius: 4px;background-color: #edf1f6;margin: -1px;}#dpmaxz_fbm_gui .dpmaxz_fbm_menus .dpmaxz_fbm_row {position: relative;color: black;height: 22px;line-height: 22px;vertical-align: middle;float: none;}#dpmaxz_fbm_gui .dpmaxz_fbm_menus .dpmaxz_fbm_row span {display: inline-block !important;}#dpmaxz_fbm_gui .dpmaxz_fbm_menus .dpmaxz_fbm_rowicon {display: inline-block;width: 26px;height: 22px;position: relative;vertical-align: top;border-right: 1px solid #e2e3e3;font-size: 12px; color: black;}#dpmaxz_fbm_gui .dpmaxz_fbm_menus .dpmaxz_fbm_rowtext {display: inline-block;border-left: 1px solid #ffffff;padding: 0 4px;font: normal 1em 'Segoe UI',Verdana,Arial; font-size: 12px;}.dpmaxz_highlight {border-image: url(chrome-extension://pkdnjfgdoolnmiacpdamadcneoblphbj/images/highlighter.png) 5 9 8 6 repeat;border-style: solid;}#dpmaxz_fbi_root .dpmaxz_fbi_mainbkg .dpmaxz_fbi_fbishield {width: 32px; height: 37px;}.dpmaxz_cf:after {clear: both;content: '.';display: block;font-size: 0;height: 0;line-height: 0;visibility: hidden;}.dpmaxz_hide {display: none;}#dpmaxz_all div {margin: 0;padding: 0;display: block; white-space: normal; text-align: left; }#dpmaxz_all *, #dpmaxz_all *:after, #dpmaxz_all *:before{margin: 0;padding: 0;box-sizing: content-box; width: auto;}#dpmaxz_all {position:fixed;z-index:2147483646;-webkit-user-select: none; cursor: default;transition: visibility .2s cubic-bezier(0, 0, 0, 1.21),opacity .2s cubic-bezier(0, 0, 0, 1.21);}.dpmaxz_all_hidden {visibility: hidden;opacity: 0;}.dpmaxz_fbb_shadowframe {position:relative;}.dpmaxz_fbb_caption {position:relative;}.dpmaxz_fbb_mainimg {float: left;}.dpmaxz_float_right {float: right;}#dpmaxz_all * {box-sizing: content-box;}#dpmaxz_all input[type='button']{width: auto; height: auto;min-width: auto; }#dpmaxz_all input[type='checkbox']{margin: 0;width: auto;        height: auto;       opacity: 1;         float: none;        position: static;}#dpmaxz_all {right: 380px;top: 10px;}#dpmaxz_all .dpmaxz_fbb_shadowframe {width:370px;background: url(chrome-extension://pkdnjfgdoolnmiacpdamadcneoblphbj/images/bar-bkg.png) repeat scroll 0 0;background-size: 100% 100%; background-color: #f9f9f9;border: 1px solid #bebebe;border-radius: 3px;box-shadow: 2px 2px 2px rgba(0, 0, 0, 0.1);}#dpmaxz_all #dpmaxz_cap {margin-left: 10px;vertical-align:top;}#dpmaxz_all .dpmaxz_fbb_caption {height: 34px;padding: 12px 0 0 18px;font: normal normal bold 15px/26px 'Helvetica Neue',Helvetica,Arial,sans-serif;background-color: rgba(184, 184, 184, 0.3);color:#5f5f5f;}#dpmaxz_all .dpmaxz_fbb_mainbody {padding: 16px 12px 14px;}#dpmaxz_all .dpmaxz_fbb_maintext {margin-left:60px;font: normal normal normal 12px/18px 'Helvetica Neue',Helvetica,Arial,sans-serif;color: #414141;}#dpmaxz_all .dpmaxz_btn_wrap {margin-top:20px;}#dpmaxz_all input[type='button'].dpmaxz_fbb_btn {line-height: normal;overflow: visible;cursor: pointer;text-align: center;vertical-align: middle;text-decoration: none;transition: all .2s ease 0;font:normal 12px/18px 'Helvetica Neue',Helvetica,Arial,sans-serif;letter-spacing: 0.03em; border: 1px solid #aaa;border-radius: 2px;}#dpmaxz_all input[type='button'].dpmaxz_fbb_btn:hover, #dpmaxz_all input[type='button'].dpmaxz_fbb_btn:focus {color: #212121;border: 1px solid #999;background-color: #fff;border-color: #8b8b8b;box-shadow: 1px 1px 2px 2px rgba(119, 119, 119, 0.23);}#dpmaxz_all input[type='button'].dpmaxz_fbb_btn:hover:disabled{box-shadow:none}#dpmaxz_all input[type='button'].dpmaxz_fbb_mbtn {position: relative;display: inline-block;padding: 8px 15px;color: #000;background-color:#f8f8f8;}#dpmaxz_all input[type='button'].dpmaxz_fbb_mbtn:hover, #dpmaxz_all input[type='button'].dpmaxz_fbb_mbtn:focus {}#dpmaxz_all input[type='button'].dpmaxz_fbb_mbtn:active {box-shadow: none;}#dpmaxz_all input[type='button'].dpmaxz_fbb_mbtn:disabled {color: #bbb;cursor: default;border: 1px solid #e3e3e3;}#dpmaxz_all input[type='button']#dpmaxs_c.dpmaxz_fbb_close {position: absolute;right: 0;width: 42px;margin: 0 12px;padding: 2px 10px;color: #555;background-color:rgba(68,202,255,0);}#dpmaxz_all .dpmaxz_fbb_chk * {font:normal normal normal 12px/18px 'Helvetica Neue',Helvetica,Arial,sans-serif;color:#414141;}#dpmaxz_all .dpmaxz_fbb_chk label {display: block; margin-top:10px;margin-left:60px;}#dpmaxz_all .dpmaxz_fbb_chk span {margin-left:6px;line-height: 20px;vertical-align:middle;color:#414141;}#dpmaxz_all input[type='checkbox']{-ms-transform: scale(1.2); -moz-transform: scale(1.2); -webkit-transform: scale(1.2); -webkit-appearance: checkbox;margin: 0;}#dpmaxz_all .dpmaxz_fbb_shadow {background:url(chrome-extension://pkdnjfgdoolnmiacpdamadcneoblphbj/images/bar-shadow.png) no-repeat scroll 0 0;background-color:transparent;background-size:100% 100%;height:33px;}</style>
    <link rel="stylesheet" type="text/css" href="<c:url value='/template/web/temp/index_files/0.d27ecdc4.css' />">
    <script charset="utf-8" src="<c:url value='/template/web/temp/index_files/0.d27ecdc4.js.download' />"></script>
    <script charset="utf-8" src="<c:url value='/template/web/temp/index_files/8.d27ecdc4.js.download' />"></script>
    <script charset="utf-8" src="<c:url value='/template/web/temp/index_files/1.d27ecdc4.js.download' />"></script>
    <link rel="stylesheet" type="text/css" href="<c:url value='/template/web/index_files/148.d27ecdc4.css' />">
    <script charset="utf-8" src="<c:url value='/template/web/temp/index_files/148.d27ecdc4.js.download' />"></script>
    <script charset="utf-8" src="<c:url value='/template/web/temp/index_files/60.d27ecdc4.js.download' />"></script>
    <script charset="utf-8" src="<c:url value='/template/web/index_files/4.d27ecdc4.js.download' />"></script>
    <link rel="stylesheet" type="text/css" href="<c:url value='/template/web/index_files/53.d27ecdc4.css' />">
    <script charset="utf-8" src="<c:url value='/template/web/index_files/53.d27ecdc4.js.download' />"></script>
    <script charset="utf-8" src="<c:url value='/template/web/index_files/58.d27ecdc4.js.download' />"></script>
    <style type="text/css">#livechat-full {	top: 0!important;	bottom: 0!important;	right: 0!important;	height: auto!important;}</style>

    <dec:head></dec:head>
</head>
<body ontouchstart="" data-gr-c-s-loaded="true" >
    <div class="modal fade" id="notification-template" role="dialog">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal"></button>
                    <h4 class="modal-title"></h4>
                </div>
                <div class="modal-date"></div>
                <div class="modal-image"></div>
                <div class="modal-body">
                    <p></p>
                </div>
                <div class="modal-footer">
                    <div class="ui-buttons-line">
                        <button class="ui-button" data-dismiss="modal" id="more-info">
                                <span>
                                    More Info
                                </span>
                        </button>
                    </div>
                </div>
                <div id="notification-id"></div>
            </div>
        </div>
    </div>
    <div class="wrapper">
        <div class="noJavascript">
            <noscript>
                JavaScript is disabled or not supported in your browser!
            </noscript>
        </div>
        <%@ include file="/common/web/home/header.jsp"%>
        <div id="wallet">
            <div id="dashboard">
                <div class="container">
                    <div class="row">
                        <%@ include file="/common/web/home/menu.jsp"%>
                        <dec:body />
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>
