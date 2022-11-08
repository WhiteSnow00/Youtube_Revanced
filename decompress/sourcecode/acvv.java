import java.nio.charset.Charset;
import android.text.Spanned;
import java.util.Iterator;
import org.json.JSONObject;
import org.json.JSONException;
import java.util.List;
import java.util.Collections;
import android.text.Html;
import android.util.SparseArray;
import org.json.JSONArray;
import java.util.ArrayList;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acvv implements acwi
{
    public wyn a;
    private final Map b;
    private byte[] c;
    private String d;
    private final String e;
    private adfy f;
    
    public acvv() {
        this.d = null;
        this.b = new HashMap();
        this.e = null;
    }
    
    public acvv(final byte[] c, final String e) {
        this.c = c;
        this.b = new HashMap();
        this.e = e;
    }
    
    public acvv(final byte[] c, final Map b, final String e) {
        this.c = c;
        this.b = b;
        this.e = e;
    }
    
    public final void a(final adfy f) {
        this.f = f;
    }
    
    public final wyn b() {
        return this.a;
    }
    
    public final void c(final wyn a) {
        this.a = a;
    }
    
    @Override
    public final int d() {
        return 1;
    }
    
    @Override
    public final acwf e() {
        if (this.d == null) {
            adbp.l(this.f, "SuggestResponseNull", "JSONResponse");
            final byte[] c = this.c;
            if (c == null || c.length == 0) {
                return null;
            }
            try {
                this.d = new String(c, cji.d(this.b, "ISO-8859-1"));
            }
            catch (final UnsupportedEncodingException ex) {
                this.d = new String(this.c);
            }
        }
        if (this.d.isEmpty()) {
            adbp.l(this.f, "SuggestResponseEmpty", "JSONResponse");
            return null;
        }
        final ArrayList list = new ArrayList(10);
        final String d = this.d;
        try {
            final JSONArray jsonArray = new JSONArray(d.substring(d.indexOf(91)));
            final SparseArray sparseArray = new SparseArray();
            boolean b2 = false;
            Label_0293: {
                if (jsonArray.length() > 2) {
                    final JSONObject jsonObject = jsonArray.getJSONObject(2);
                    final boolean b = jsonObject.has("e") && jsonObject.getInt("e") > 0;
                    final boolean has = jsonObject.has("ai");
                    b2 = b;
                    if (!has) {
                        break Label_0293;
                    }
                    try {
                        final JSONObject jsonObject2 = jsonObject.getJSONObject("ai");
                        final Iterator keys = jsonObject2.keys();
                        while (true) {
                            b2 = b;
                            if (!keys.hasNext()) {
                                break Label_0293;
                            }
                            final String s = keys.next();
                            sparseArray.put(Integer.parseInt(s), (Object)jsonObject2.getString(s));
                        }
                    }
                    catch (final NumberFormatException ex2) {
                        sparseArray.clear();
                        adbp.k("Invalid Group Id found in suggestions", ex2);
                        trn.b("Invalid group ID found in suggestions");
                        b2 = b;
                        break Label_0293;
                    }
                }
                b2 = false;
            }
            final JSONArray jsonArray2 = jsonArray.getJSONArray(1);
            int i = 0;
            boolean b3 = false;
            while (i < jsonArray2.length()) {
                final JSONArray jsonArray3 = jsonArray2.getJSONArray(i);
                final Spanned fromHtml = Html.fromHtml(jsonArray3.getString(0), 63);
                final String string = fromHtml.toString();
                final int optInt = jsonArray3.optInt(1, 0);
                String string2 = null;
                String string3 = null;
                JSONObject jsonObject5 = null;
                Label_0454: {
                    JSONObject jsonObject3 = null;
                    Label_0448: {
                        JSONObject jsonObject4;
                        if (jsonArray3.length() > 3) {
                            jsonObject3 = jsonArray3.getJSONObject(3);
                            if (optInt != 33) {
                                if (optInt != 35) {
                                    jsonObject4 = jsonObject3;
                                }
                                else {
                                    jsonObject4 = jsonObject3;
                                    if (jsonObject3.has("du")) {
                                        string2 = jsonObject3.getString("du");
                                        break Label_0448;
                                    }
                                }
                            }
                            else {
                                jsonObject4 = jsonObject3;
                                if (jsonObject3.has("b")) {
                                    string3 = jsonObject3.getString("b");
                                    string2 = null;
                                    jsonObject5 = jsonObject3;
                                    break Label_0454;
                                }
                            }
                        }
                        else {
                            jsonObject4 = null;
                        }
                        string2 = null;
                        jsonObject3 = jsonObject4;
                    }
                    string3 = null;
                    jsonObject5 = jsonObject3;
                }
                int int1;
                String s2;
                if (sparseArray.size() > 0 && jsonObject5.has("zl")) {
                    int1 = jsonObject5.getInt("zl");
                    s2 = (String)sparseArray.get(int1);
                }
                else {
                    int1 = 0;
                    s2 = null;
                }
                int int2;
                if (sparseArray.size() > 0 && jsonObject5.has("zm")) {
                    int2 = jsonObject5.getInt("zm");
                    b3 = true;
                }
                else {
                    int2 = -1;
                }
                int[] array = null;
                Label_0612: {
                    if (jsonArray3.length() > 2) {
                        final JSONArray jsonArray4 = jsonArray3.getJSONArray(2);
                        if (jsonArray4 != null && jsonArray4.length() > 0) {
                            array = new int[jsonArray4.length()];
                            for (int j = 0; j < jsonArray4.length(); ++j) {
                                array[j] = jsonArray4.getInt(j);
                            }
                            break Label_0612;
                        }
                    }
                    array = null;
                }
                list.add(new acwl(string, optInt, 2, array, string2, int1, s2, int2, string3, fromHtml));
                ++i;
            }
            if (b3) {
                Collections.sort((List<Comparable>)list);
            }
            return new acwf(list, b2, this.e);
        }
        catch (final IndexOutOfBoundsException ex3) {
            adbp.l(this.f, "IndexOutOfBoundsException", "JSONResponse");
            adbp.k("Could not find valid response data", ex3);
            trn.d("Could not find valid response data, response was".concat(String.valueOf(this.d)), (Throwable)ex3);
        }
        catch (final JSONException ex4) {
            adbp.l(this.f, "JSONException", "JSONResponse");
            adbp.k("error processing suggestions", (Throwable)ex4);
            trn.d("error processing suggestions, response was ".concat(String.valueOf(this.d)), (Throwable)ex4);
            goto Label_0714;
        }
    }
    
    @Override
    public final String f() {
        return this.e;
    }
    
    @Override
    public final byte[] g() {
        final byte[] c = this.c;
        if (c != null) {
            return c;
        }
        final String d = this.d;
        if (d != null) {
            return d.getBytes(Charset.forName("UTF-8"));
        }
        return null;
    }
}
