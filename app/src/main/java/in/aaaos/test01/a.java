package in.aaaos.test01;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.TextView;

public class a extends BaseAdapter {
    public Integer[] a = new Integer[225];
    public String[] b = {"सु", "प्र ", "उ", "बि", "हो", "मु", "ग", "व", "सु", "नु", "बि", "ध", "धि", "इ", "द", "र", "रु", "फ", "सि", "सि", "रें", "बस", "है", "मं", "ल", "न", "ल", "य", "न", "अं", "सुज", "सो", "ग", "सु", "कु", "म", "स", "ग", "त", "न", "इ", "ल", "धा", "बे", "नो", "त्य", "र", "न", "कु", "जो", "म", "रि", "र", "र", "अ", "की", "हो", "सं", "रा", "य", "पु", "सु", "थ", "सी", "जे", "इ", "ग", "म", "सं", "क", "रे", "हो", "स", "स", "नि", "त", "र ", "त", "र ", "स", "हूँ", "ह", "ब", "ब", "प", "चि", "स", "य", "स", "तु", "म", "का", "I", "र", "र", "मा", "मि", "मी", "म्हा", "I", "जा", "हू", "हीं", "I", "जु", "ता", "र", "रे", "री", "हृ", "का", "फ", "खा", "जि", "ई", "I", "रा", "पु", "द", "ल", "नि", "को", "मि", "गो", "न", "म", "जि", "य", "ने", "मनि", "क", "ज", "प", "स", "ल", "हि", "रा", "मि", "स", "रि", "ग", "द", "न", "ख", "म", "खि", "जि", "मनि", "त", "जं", "सिं", "मु", "नु", "न", "कौ", "मि", "ज", "र", "ग", "धु", "ख", "सु", "का", "स", "र", "गु", "क", "म", "अ", "ध", "नि", "म", "ल", "I", "न", "ब", "ती", "न", "रि", "भ", "ना", "पु", "व", "अ", "ढा", "र", "ल", "का", "ए", "तु", "र", "न", "नु", "व", "थ", "सि", "ह", "सु", "म्ह", "रा", "र", "स", "हिं", "र", "त", "न", "ख", "I", "ज", "I", "र", "सा", "I", "ला", "धी", "I", "री", "I", "हू", "हीं", "खा", "जू", "ई", "रा", "रे"};
    private Context c;

    public a(Context context) {
        this.c = context;
        Log.d("TAG", new StringBuilder(String.valueOf(this.b.length)).append("length").toString());
    }

    public int getCount() {
        return this.a.length;
    }

    public Object getItem(int i) {
        return this.a[i];
    }

    public long getItemId(int i) {
        return 0;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = new TextView(this.c);
        textView.setText(this.b[i]);
        //textView.setTypeface(null, 1);
        textView.setGravity(17);
        textView.setTextColor(-16777216);
        textView.setId(i + 1);
        if ((this.c.getResources().getConfiguration().screenLayout & 15) == 4) {
            textView.setTextSize(22.0f);
            textView.setLayoutParams(new ViewGroup.LayoutParams(60, 60));
        } else if ((this.c.getResources().getConfiguration().screenLayout & 15) == 3) {
            textView.setTextSize(20.0f);
            textView.setLayoutParams(new ViewGroup.LayoutParams(50, 50));
        } else if ((this.c.getResources().getConfiguration().screenLayout & 15) == 2) {
            textView.setTextSize(16.0f);
            textView.setLayoutParams(new ViewGroup.LayoutParams(40, 40));
        } else if ((this.c.getResources().getConfiguration().screenLayout & 15) == 1) {
            textView.setTextSize(14.0f);
            textView.setLayoutParams(new ViewGroup.LayoutParams(30, 30));
        } else {
            textView.setTextSize(18.0f);
            textView.setLayoutParams(new ViewGroup.LayoutParams(50, 50));
        }
        return textView;
    }
}
