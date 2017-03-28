package com.example.ideaspeaker2;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

/**
 * Created by 立淳 on 2016/12/14.
 */
public class ConceptWordlList extends Fragment {

    private String[] concepts_people = {"我", "妳", "他", "爸爸", "阿姨", "那個人", "姐姐", "哥哥", "親戚", "朋友", "老師", "同學"};
    private String[] concepts_emotion = {"開心", "生氣", "難過", "爽", "不爽", "不開心", "期待", "興奮", "有感覺", "沒感覺", "忌妒", "好玩"};
    private String[] concepts_degree = {"很", "非常", "超", "有夠", "幾乎不", "都", "實在是", "一點點", "很多", "滿滿的", "爆炸多地", "不"};
    private String[] concepts_moment = {"今天", "昨天", "明天", "上禮拜", "下禮拜", "早上", "中午", "下午", "晚上", "那時候", "半夜", "之前"};
    private String[] concepts_place = {"我家", "你家", "這裡", "那裡", "大平台", "醫院", "外面", "學校", "車上", "醫院", "廁所", "餐廳"};
    private String[] concepts_action = {"去", "想", "知道", "吃", "玩", "找", "抱著", "需要", "發生", "要", "打", "等"};


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        super.onCreateView(inflater, container, savedInstanceState);

        return inflater.inflate(R.layout.concept_word_list, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        Bundle conceptArg = getArguments();
        String conceptWord = conceptArg.getString("Concept");
        Button[] word = new Button[50];
        getAllButtonId(word);

        switch(conceptWord){
            case "人物" :
                for(int i=1;i<=12;i++){
                    final String tmpWord = concepts_people[i-1];
                    word[i].setText(tmpWord);
                    word[i].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            MainActivity.addtoMainText(tmpWord);
                            getActivity().onBackPressed();
                        }
                    });
                }
                break;
            case "感受" :
                for(int i=1;i<=12;i++){
                    final String tmpWord = concepts_emotion[i-1];
                    word[i].setText(tmpWord);
                    word[i].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            MainActivity.addtoMainText(tmpWord);
                            getActivity().onBackPressed();
                        }
                    });
                }
                break;
            case "程度" :
                for(int i=1;i<=12;i++){
                    final String tmpWord = concepts_degree[i-1];
                    word[i].setText(tmpWord);
                    word[i].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            MainActivity.addtoMainText(tmpWord);
                            getActivity().onBackPressed();
                        }
                    });
                }
                break;
            case "時間" :
                for(int i=1;i<=12;i++){
                    final String tmpWord = concepts_moment[i-1];
                    word[i].setText(tmpWord);
                    word[i].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            MainActivity.addtoMainText(tmpWord);
                            getActivity().onBackPressed();
                        }
                    });
                }
                break;
            case "地點" :
                for(int i=1;i<=12;i++){
                    final String tmpWord = concepts_place[i-1];
                    word[i].setText(tmpWord);
                    word[i].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            MainActivity.addtoMainText(tmpWord);
                            getActivity().onBackPressed();
                        }
                    });
                }
                break;
            case "動作" :
                for(int i=1;i<=12;i++){
                    final String tmpWord = concepts_action[i-1];
                    word[i].setText(tmpWord);
                    word[i].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            MainActivity.addtoMainText(tmpWord);
                            getActivity().onBackPressed();
                        }
                    });
                }
                break;
        }
    }
    private Button[] getAllButtonId(Button[] allButton){
        allButton[1] = (Button) getView().findViewById(R.id.word1);
        allButton[2] = (Button) getView().findViewById(R.id.word2);
        allButton[3] = (Button) getView().findViewById(R.id.word3);
        allButton[4] = (Button) getView().findViewById(R.id.word4);
        allButton[5] = (Button) getView().findViewById(R.id.word5);
        allButton[6] = (Button) getView().findViewById(R.id.word6);
        allButton[7] = (Button) getView().findViewById(R.id.word7);
        allButton[8] = (Button) getView().findViewById(R.id.word8);
        allButton[9] = (Button) getView().findViewById(R.id.word9);
        allButton[10] = (Button) getView().findViewById(R.id.word10);
        allButton[11] = (Button) getView().findViewById(R.id.word11);
        allButton[12] = (Button) getView().findViewById(R.id.word12);
        return allButton;
    }
}
