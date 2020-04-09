package com.lzx.demo.ui;

import com.lzx.demo.base.BaseMainActivity;

public class CommonActivity extends BaseMainActivity {

    private static final Class<?>[] ACTIVITY = {
            LinearLayoutActivity.class,
            SpecialLinearLayoutActivity.class,
            EndlessLinearLayoutActivity.class,
            EndlessGridLayoutActivity.class,
            EndlessStaggeredGridLayoutActivity.class,
            EmptyViewActivity.class,
            SwipeRefreshLayoutActivity.class,
            ExpandableRecyclerViewOneActivity.class,
            MulItemLinearLayoutActivity.class,
            MulItemGridLayoutActivity.class,
            PartialRefreshActivity.class,
            NestRecyclerViewActivity.class,
            Nest2RecyclerViewActivity.class,
            AlphaChangeActivity.class,
            BannerHeaderLayoutActivity.class,
            QzoneHeaderActivity.class,
            MomentsHeaderActivity.class,
            CustomLoadingFootActivity.class,
            ClickLoadingFootActivity.class};

    private static final String[] TITLE = {
            "LinearLayoutSample",
            "SpecialLinearLayoutActivity",
            "EndlessLinearLayoutActivity",
            "EndlessGridLayoutActivity",
            "EndlessStaggeredGridLayoutActivity",
            "EmptyViewActivity",
            "SwipeRefreshLayoutActivity",
            "ExpandableRecyclerViewOneActivity",
            "MulItemLinearLayoutActivity","MulItemGridLayoutActivity",
            "(局部刷新)PartialRefreshActivity",
            "(Recylcerview嵌套)NestRecyclerViewActivity",
            "Nest2RecyclerViewActivity",
            "AlphaChangeActivity",
            "BannerHeaderLayoutActivity",
            "QzoneHeaderActivity",
            "MomentsHeaderActivity",
            "CustomLoadingFootActivity",
            "ClickLoadingFootActivity"};

    public Class<?>[] getActivitys() {
        return ACTIVITY;
    }

    @Override
    public String[] getTitles() {
        return TITLE;
    }


}
