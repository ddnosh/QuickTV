package la.xiong.tv.ui.activity.main;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

import com.flyco.tablayout.SlidingTabLayout;

import butterknife.BindView;
import la.xiong.tv.R;
import la.xiong.tv.base.BaseTActivity;
import la.xiong.tv.ui.fragment.home.HomeFragment;

/**
 * @author ddnosh
 * @website http://blog.csdn.net/ddnosh
 */
public class MainActivity extends BaseTActivity {

    @BindView(R.id.vp_tab_ftl)
    ViewPager mViewPager;

    @BindView(R.id.ftl_main_tab)
    SlidingTabLayout mSlidingTabLayout;

    private String[] mTitles = {"首页"};

    private MyPagerAdapter mAdapter;

    @Override
    protected int getContentViewLayoutID() {
        return R.layout.activity_main;
    }

    @Override
    protected void initViewsAndEvents() {
        mAdapter = new MyPagerAdapter(getSupportFragmentManager());
        mViewPager.setAdapter(mAdapter);
        mSlidingTabLayout.setViewPager(mViewPager, mTitles);
    }

    private class MyPagerAdapter extends FragmentPagerAdapter {
        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public int getCount() {
            return mTitles.length;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mTitles[position];
        }

        @Override
        public Fragment getItem(int position) {
            Fragment fragment = null;
            switch (position) {
                case 0:
                    fragment = HomeFragment.newInstance();
                    break;
//                case 1:
//                    fragment = new HomeFragment();
//                    break;
//                case 2:
//                    fragment = new HomeFragment();
//                    break;
                default:
                    break;
            }

            return fragment;
        }
    }
}
