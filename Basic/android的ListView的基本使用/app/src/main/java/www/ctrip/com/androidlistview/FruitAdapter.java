package www.ctrip.com.androidlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * 项目名称：android的ListView的基本使用
 * 类描述：
 * 创建人：huangchengdu
 * 创建时间：16/8/31 下午10:59
 * 修改人：huangchengdu
 * 修改时间：16/8/31 下午10:59
 * 修改备注：
 */

/**
 * 接下来需要创建一个自定义的适配器,这个适配器继承自 ArrayAdapter,并将泛型指定 为 Fruit 类。
 */
public class FruitAdapter extends ArrayAdapter<Fruit>{
    private int resourceId;
    public FruitAdapter(Context context, int resource, List<Fruit> objects) {
        super(context, resource, objects);
        resourceId = resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Fruit fruit = getItem(position);
        View view = LayoutInflater.from(getContext()).inflate(resourceId,null);
        ImageView fruitImage = (ImageView) view.findViewById(R.id.fruit_image);
        TextView fruitName = (TextView) view.findViewById(R.id.fruit_name);
        fruitImage.setImageResource(fruit.getImageId());
        fruitName.setText(fruit.getName());
        return view;
    }
}
