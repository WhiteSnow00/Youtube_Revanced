import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import android.text.TextUtils;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dic
{
    private static final String b;
    private static final Map c;
    public boolean a;
    private boolean d;
    private Map e;
    
    static {
        String b2 = System.getProperty("http.agent");
        if (!TextUtils.isEmpty((CharSequence)b2)) {
            final int length = b2.length();
            final StringBuilder sb = new StringBuilder(b2.length());
            for (int i = 0; i < length; ++i) {
                final char char1 = b2.charAt(i);
                Label_0085: {
                    char c2;
                    if ((c2 = char1) <= '\u001f') {
                        if (char1 != '\t') {
                            break Label_0085;
                        }
                        c2 = '\t';
                    }
                    if (c2 < '\u007f') {
                        sb.append(c2);
                        continue;
                    }
                }
                sb.append('?');
            }
            b2 = sb.toString();
        }
        b = b2;
        final HashMap hashMap = new HashMap(2);
        if (!TextUtils.isEmpty((CharSequence)b2)) {
            hashMap.put("User-Agent", Collections.singletonList(new did(b2)));
        }
        c = Collections.unmodifiableMap((Map<?, ?>)hashMap);
    }
    
    public dic() {
        this.d = true;
        this.e = dic.c;
        this.a = true;
    }
    
    public final die a() {
        this.d = true;
        return new die(this.e);
    }
    
    public final void b() {
        if (this.d) {
            this.d = false;
            final HashMap e = new HashMap(this.e.size());
            for (final Map.Entry<String, V> entry : this.e.entrySet()) {
                e.put(entry.getKey(), new ArrayList((Collection<?>)entry.getValue()));
            }
            this.e = e;
        }
    }
    
    public final List c() {
        List list;
        if ((list = this.e.get("Authorization")) == null) {
            list = new ArrayList();
            this.e.put("Authorization", list);
        }
        return list;
    }
}
