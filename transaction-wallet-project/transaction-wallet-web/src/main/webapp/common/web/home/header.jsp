<%@ page language="java" contentType="text/html;charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<c:url value="/deposit.html" var="depositUrl">
    <c:param name="urlType" value="url_deposit" />
</c:url>
<c:url value="/withdraw.html" var="withdrawUrl">
    <c:param name="urlType" value="url_withdraw" />
</c:url>
<c:url value="/transfer.html" var="transferUrl">
    <c:param name="urlType" value="url_transfer" />
</c:url>
<c:url value="/home.html" var="homeUrl">
    <c:param name="urlType" value="url_home" />
</c:url>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<div>
    <header id="header" class="header">
        <a href="#" class="logo">
            Coin Wallet
        </a>

        <nav id="nav-primary" class="nav-primary">
            <ul class="nav-menu">
                <li class="active">
                    <a href="#" title="Account">
                        Account
                    </a>
                </li>
                <li class="">
                    <a href="#" title="Contact">
                        Contact
                    </a>
                </li>
            </ul>
        </nav>

        <div class="components-row">



            <div id="profile-component" class="profile-component">
					<span>
						<i class="fa fa-user" aria-hidden="true"></i>
					</span>
                <div id="notification-count" class="notification-count"></div>
                <ul id="notification" class="profile-component-options">
                    <ul id="profile-information">
                        <li id="userMail" class="userMail copy-element title-tooltip" title-tooltip="" ></li>

                    </ul>
                    <li>
                        <a href="#">
                            Wallet API
                        </a>
                    </li>
                    <li>
                        <a href="#">
                            Referral
                        </a>
                    </li>
                    <li>
                        <a href="#l">
                            Verification
                        </a>
                    </li>
                    <li>
                        <a href="#">
                            Linked cards
                        </a>
                    </li>
                    <li>
                        <a href="#">
                            Settings
                        </a>
                    </li>
                    <li>
                        <a href="https://spectrocoin.com/en/setPass.html">
                            Set password
                        </a>
                    </li>
                    <li>
                        <a href="https://spectrocoin.com/en/logout.html?csrfToken=67f49e7d6b1e7445cba4ac027cfc48878df8d7bc-1537321472251-05a4d51dd3bd64822d3d8c93">
                            <i class="fa fa-power-off" aria-hidden="true"></i>
                            Logout
                        </a>
                    </li>
                </ul>
            </div>

            <button id="nav-trigger" class="nav-trigger">
                <span></span>
                <span></span>
                <span></span>
            </button>
        </div>
    </header>
    <nav id="dashboard-secondary-nav">
        <div class="container">
            <div class="row">
                <div class="col-xs-12">
                    <ul class="secondary-nav">
                        <li>
                            <a href="${homeUrl}" class="active">
                                <div class="icon icon-wallet"></div>
                                <span>Wallets</span>
                            </a>
                        </li>
                        <li>
                            <a href="${transferUrl}" class="">
                                <div class="icon icon-exchange"></div>
                                <span>Transfer</span>
                            </a>
                        </li>
                        <li>
                            <a href="${depositUrl}" class="">
                                <div class="icon icon-deposit"></div>
                                <span>Deposit</span>
                            </a>
                        </li>
                        <li>
                            <a href="${withdrawUrl}" class="">
                                <div class="icon icon-withdraw"></div>
                                <span>Withdraw</span>
                            </a>
                        </li>
                        <li>
                            <a href="#" class="">
                                <div class="icon icon-cards"></div>
                                <span>Cards</span>
                            </a>
                        </li>

                    </ul>
                </div>
            </div>
        </div>
    </nav>
</div>