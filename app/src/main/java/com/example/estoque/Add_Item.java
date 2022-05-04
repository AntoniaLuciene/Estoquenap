package com.example.estoque;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.Fragment;

import java.util.Random;

public class Add_Item extends Fragment {

    View view;
    EditText cod_item, nome_item, qnt_item, preco_item;
    Button btn_add;


    RadioButton fem, masc;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.add_item, container, false);

        cod_item = (EditText) view.findViewById(R.id.item_cdg);
        nome_item = (EditText) view.findViewById(R.id.item_nome);
        qnt_item = (EditText) view.findViewById(R.id.item_qntd);
        preco_item = (EditText) view.findViewById(R.id.item_preco);
        btn_add = (Button) view.findViewById(R.id.btn_estoque);
        fem = (RadioButton) view.findViewById(R.id.radioButton2);
        masc = (RadioButton) view.findViewById(R.id.radioButton);




        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String gen = "";

                if(masc.isChecked()){
                    gen = "Masculina";

                }
                if (fem.isChecked()){
                    gen = "Feminina";
                }

                Gerar_Notificacao peca_adicionada = new Gerar_Notificacao(getActivity());

                NotificationCompat.Builder aviso =
                        peca_adicionada.builder
                                (nome_item.getText().toString()+" "+gen+" Adicionada ao Estoque"
                                        ,"Verifique sua lista de estoque");

                peca_adicionada.getManager().notify(new Random().nextInt(), aviso.build());

            }
        });




        return view;
    }
}
