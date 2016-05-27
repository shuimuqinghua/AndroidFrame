package paul.androidframe.baseview.inter;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import paul.androidframe.presenter.BasePresenter;

/**
 * @author Mr.Y
 * @version $Rev$
 * @time on 2016/5/26 17:06
 * @des 基类加载View接口类
 * @updateAuthor $Author$
 * @updateDate 2016/5/26$
 * @updateDes ${TODO}
 */
public interface IBase {
    BasePresenter getPresenter();

    View createView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState);

    void bindView(Bundle savedInstanceState);

    View getView();

    int getContentLayout();
}
