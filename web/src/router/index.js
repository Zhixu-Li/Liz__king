import{ createRouter, createWebHistory } from 'vue-router'
import PkindexView from '../views/pk/PkindexView.vue'
import RanklistindexView from '../views/ranklist/RanklistindexView.vue'
import RecordindexView from '../views/record/RecordindexView.vue'
import UserBotindexView from '../views/user/bot/UserBotindexView.vue'
import NotFound from '../views/error/NotFound.vue'
const routes = [
    {
        path: "/",
        name:"home",
        redirect: "/Pk/"

    },
    {
    path: "/pk/",
    name: "pk_index",
    component:PkindexView, 
    },
    {
        path: "/Record/",
        name: "record_index",
        component:RecordindexView, 
        },
        {
            path: "/ranklist/",
            name: "ranklist_index",
            component:RanklistindexView, 
            },
            {
                path: "/user/bot/",
                name: "user_bot_index",
                component:UserBotindexView, 
                },
                {
                    path: "/404/",
                    name: "404",
                    component: NotFound, 
                    },
                    {
                        path: "/:catchAll(.*)",
                        redirect: "/404/"

                    }

]
const router= createRouter({
    history: createWebHistory(),
    routes
})
export default router