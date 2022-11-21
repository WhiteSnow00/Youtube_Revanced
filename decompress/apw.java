import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.HashMap;
import android.os.Bundle;
import android.icu.text.DecimalFormatSymbols;
import android.text.PrecomputedText$Params;
import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apw
{
    static PrecomputedText$Params a(final TextView textView) {
        return textView.getTextMetricsParams();
    }
    
    static void b(final TextView textView, final int firstBaselineToTopHeight) {
        textView.setFirstBaselineToTopHeight(firstBaselineToTopHeight);
    }
    
    static String[] c(final DecimalFormatSymbols decimalFormatSymbols) {
        return decimalFormatSymbols.getDigitStrings();
    }
    
    public static final avj d(final Bundle bundle, final Bundle bundle2) {
        if (bundle == null) {
            avj avj;
            if (bundle2 == null) {
                avj = new avj();
            }
            else {
                final HashMap hashMap = new HashMap();
                for (final String s : bundle2.keySet()) {
                    s.getClass();
                    hashMap.put(s, bundle2.get(s));
                }
                avj = new avj((Map)hashMap);
            }
            return avj;
        }
        final ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
        final ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
        if (parcelableArrayList != null && parcelableArrayList2 != null && parcelableArrayList.size() == parcelableArrayList2.size()) {
            final LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (int size = parcelableArrayList.size(), i = 0; i < size; ++i) {
                final Object value = parcelableArrayList.get(i);
                value.getClass();
                linkedHashMap.put(value, parcelableArrayList2.get(i));
            }
            return new avj((Map)linkedHashMap);
        }
        throw new IllegalStateException("Invalid bundle passed as restored state");
    }
}
