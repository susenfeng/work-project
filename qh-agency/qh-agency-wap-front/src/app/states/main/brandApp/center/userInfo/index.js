import conf from "../../../../../conf";
import angular from "angular";
import uiRouter from "angular-ui-router";
import confState from "./confState";
import "./css.scss";

export default angular.module(`${conf.app}.states.brandApp.center.userInfo`, [
        uiRouter
    ])
    .config(confState)
;