package zaratedev.list.shopping.com.shoppinglist.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import zaratedev.list.shopping.com.shoppinglist.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class RightFragment extends Fragment {
    View rootView;
    TextView textView;

    public RightFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_right, container, false);
        textView = (TextView) rootView.findViewById(R.id.menssage_text);

        return rootView;
    }

    public void setMessage(String message) {
        textView.setText(message);
    }

}
