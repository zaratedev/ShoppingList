package zaratedev.list.shopping.com.shoppinglist.Fragments;


import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import zaratedev.list.shopping.com.shoppinglist.R;
import zaratedev.list.shopping.com.shoppinglist.SendMenssage;


/**
 * A simple {@link Fragment} subclass.
 */
public class LeftFragment extends Fragment {
    View rootView;
    EditText editText;
    Button button;
    SendMenssage sendMenssage;

    public LeftFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_left, container, false);

        editText = (EditText) rootView.findViewById(R.id.input_text);
        button = (Button) rootView.findViewById(R.id.btn_send);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = editText.getText().toString();
                sendMenssage.sendData(message);
            }
        });
        return rootView;
    }


    public void onAttach(Activity activity) {
        super.onAttach(activity);

        try {
            sendMenssage = (SendMenssage) activity;
        }catch (ClassCastException e){
            throw new ClassCastException("Error in implementation");
        }
    }
}
