import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acay
{
    private final String a;
    private final Object b;
    private final Random c;
    private volatile Map d;
    private volatile Map e;
    
    public acay(final String a, final Random c) {
        this.b = new Object();
        this.a = a;
        this.c = c;
    }
    
    public final boolean a(final owc owc) {
        Label_0212: {
            if (this.d != null && this.e != null) {
                break Label_0212;
            }
            Object b = this.b;
            monitorenter(b);
            try {
                if (this.d == null) {
                    final String a = this.a;
                    final HashMap d = new HashMap();
                    if (a != null) {
                        try {
                            final JSONObject jsonObject = new JSONObject(a);
                            final Iterator keys = jsonObject.keys();
                            while (keys.hasNext()) {
                                final String s = keys.next();
                                final Object value = jsonObject.get(s);
                                if (value instanceof Double) {
                                    d.put(aeda.w(s), ((Double)value).floatValue());
                                }
                                else {
                                    if (!(value instanceof Integer)) {
                                        continue;
                                    }
                                    d.put(aeda.w(s), (float)value);
                                }
                            }
                        }
                        catch (final JSONException ex) {
                            zjp.c(zjo.b, zjn.w, "Error parsing ElementsPerformanceMetricSubSampleRateJsonConfig", (Throwable)ex);
                        }
                    }
                    this.d = d;
                }
                if (this.e == null) {
                    this.e = new HashMap();
                }
                monitorexit(b);
                final String w = aeda.w(owc.m);
                final Float n = this.d.get(w);
                final boolean b2 = true;
                final boolean b3 = true;
                boolean b4 = b2;
                if (n != null) {
                    if (n > 1.0f) {
                        b4 = b2;
                    }
                    else if (n == 0.0f) {
                        b4 = false;
                    }
                    else {
                        b = this.e.get(w);
                        Float value2;
                        if ((value2 = (Float)b) == null) {
                            value2 = this.c.nextFloat();
                        }
                        Float n2 = value2 + n;
                        if (n2 >= 1.0f) {
                            --n2;
                            b4 = b3;
                        }
                        else {
                            b4 = false;
                        }
                        this.e.put(w, n2);
                    }
                }
                return b4;
            }
            finally {
                monitorexit(b);
                while (true) {}
            }
        }
    }
}
