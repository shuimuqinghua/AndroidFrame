package paul.androidframe.presenter;

import paul.androidframe.baseview.inter.IBaseView;

/**
 * @author Mr.Y
 * @version $Rev$
 * @time on 2016/5/26 16:51
 * @des Presenter基类。MVP模式中的具体业务持有者。提供于其他Presenter类继承
 * @updateAuthor $Author$
 * @updateDate 2016/5/26$
 * @updateDes ${TODO}
 */
public abstract class BasePresenter<T extends IBaseView> {

    public T mView;

    /**
     * 实现MVP模式中的View与Presenter耦合
     * @param mView
     */
    public void attach(T mView) {
        this.mView = mView;
    }

    /**
     * 解除V/P耦合,销毁持有的Activity/Fragment
     */
    public void detachView() {
        if (mView != null) {
            mView = null;
        }
    }
}
