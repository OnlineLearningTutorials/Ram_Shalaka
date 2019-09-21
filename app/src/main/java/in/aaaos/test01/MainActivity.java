package in.aaaos.test01;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    LinearLayout a;
    Button[] b = new Button[225];
    TableLayout c;
    GridView d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.a = (LinearLayout) findViewById(R.id.main_layout);
        this.c = new TableLayout(getApplicationContext());
        this.d = (GridView) findViewById(R.id.gridView);
        this.d.setAdapter(new a(getApplicationContext()));
        this.d.setOnItemClickListener(this);
    }


    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        //Intent intent = new Intent(this, DialogActivity.class);
        for (int i2 = 0; i2 < 255; i2++) {
        }
        switch (i % 9) {
            case 0:
                Toast.makeText(this.getApplicationContext(),"सुनु सिय सत्य असीस हमारी।\nपूजहि मन कामना तुम्हारी॥",Toast.LENGTH_SHORT).show();
                //intent.putExtra("Doha", "सुनु सिय सत्य असीस हमारी।\nपूजहि मन कामना तुम्हारी॥");
                //intent.putExtra("Arth", "यह चौपाई बालकाण्ड मे सीता जी को गौरी जी का आशिर्वाद है। प्रश्न उत्तम है कार्य सिद्ध होगा।");
                //startActivity(intent);
                return;
            case 1:
                Toast.makeText(this.getApplicationContext(),"प्रबिसि नगर कीजे सब काजा।\nहृदय राखि कोसलपुर राजा॥",Toast.LENGTH_SHORT).show();
                //intent.putExtra("Doha", "प्रबिसि नगर कीजे सब काजा।\nहृदय राखि कोसलपुर राजा॥");
                //intent.putExtra("Arth", "यह चौपाई सुन्दरकाण्ड मे हनुमान जी के लंका मे प्रवेश करने के समय की है। अर्थ यह है कि भगवान के नाम का स्मरण करते हुये कार्य शुरू करें सफलता मिलेगी।");
                //startActivity(intent);
                return;
            case 2:
                Toast.makeText(this.getApplicationContext(),"उघरहिं अंत न होइ निबाहू।\nकालनेमि जिमि रावन राहू॥",Toast.LENGTH_SHORT).show();
                //intent.putExtra("Doha", "उघरहिं अंत न होइ निबाहू।\nकालनेमि जिमि रावन राहू॥");
                //intent.putExtra("Arth", "यह चौपाई बालकाण्ड के आरम्भ की है। कार्य की सफलता मे संदेह है।");
                //startActivity(intent);
                return;
            case 3:
                Toast.makeText(this.getApplicationContext(),"िधि बस सुजन कुसंगत परहीं।\nफनि मनि सम निज गुन अनुसरहीं॥",Toast.LENGTH_SHORT).show();
                //intent.putExtra("Doha", "बिधि बस सुजन कुसंगत परहीं।\nफनि मनि सम निज गुन अनुसरहीं॥");
                //intent.putExtra("Arth", "यह चौपाई बालकाण्ड के आरम्भ की है। अर्थ यह है कि बुरे लोगों का संग छोड़ दें कार्य की सफलता मे संदेह है।");
                //startActivity(intent);
                return;
            case 4:
                Toast.makeText(this.getApplicationContext(),"होइहि सोइ जो राम रचि राखा। \nको करितर्क बढ़ावै साखा॥",Toast.LENGTH_SHORT).show();
                //intent.putExtra("Doha", "होइहि सोइ जो राम रचि राखा। \nको करितर्क बढ़ावै साखा॥");
                //intent.putExtra("Arth", "चौपाई बालकाण्ड शिव पार्वती संवाद मे है। कार्य पूरा होने मे संदेह है। प्रभु पर छोड़ दें।");
                //startActivity(intent);
                return;
            case 5:
                Toast.makeText(this.getApplicationContext(),"मुद मंगलमय संत समाजू।\nजो जग जंगम तीरथ राजू॥",Toast.LENGTH_SHORT).show();
                //intent.putExtra("Doha", "मुद मंगलमय संत समाजू।\nजो जग जंगम तीरथ राजू॥");
                //intent.putExtra("Arth", "यह चौपाई बालकाण्ड मे संत समाजरुपी तीर्थ वर्णन मे आती है। अर्थ यह है कि कार्य सिद्ध होगा।");
                //startActivity(intent);
                return;
            case 6:
                Toast.makeText(this.getApplicationContext(),"गरल सुधा रिपु करहिं मिताई। \nगोपद सिंधु अनल सितलाई॥",Toast.LENGTH_SHORT).show();
                //intent.putExtra("Doha", "गरल सुधा रिपु करहिं मिताई। \nगोपद सिंधु अनल सितलाई॥");
                //intent.putExtra("Arth", "यह चौपाई सुन्दरकाण्ड मे हनुमान जी के लंका मे प्रवेश करने के समय की है। प्रश्न बहुत श्रेष्ठ है कार्य सिद्ध होगा।");
                //startActivity(intent);
                return;
            case 7:
                Toast.makeText(this.getApplicationContext(),"बरुन कुबेर सुरेस समीरा।\nरन सन्मुखधरि काहु न धीरा॥",Toast.LENGTH_SHORT).show();
                //intent.putExtra("Doha", "बरुन कुबेर सुरेस समीरा।\nरन सन्मुखधरि काहु न धीरा॥");
                //intent.putExtra("Arth", "यह चौपाई रावण वध पर मंदोदरी के विलाप के संदर्भ मे है। कार्य पूरा होने मे संदेह है।");
                //startActivity(intent);
                return;
            case 8:
                Toast.makeText(this.getApplicationContext(),"सुफल मनोरथ हो हुँ तुम्हारे। \nरामु लखनु सुनि भए सुखारे॥",Toast.LENGTH_SHORT).show();
                //intent.putExtra("Doha", "सुफल मनोरथ हो हुँ तुम्हारे। \nरामु लखनु सुनि भए सुखारे॥");
                //intent.putExtra("Arth", "यह चौपाई विश्वामित्र का आशिर्वाद है। प्रश्न उत्तम है कार्य सिद्ध होगा।");
                //startActivity(intent);
                return;
            default:
                return;
        }
    }

}
