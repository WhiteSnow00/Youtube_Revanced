import android.content.res.XmlResourceParser;
import org.xmlpull.v1.XmlPullParserException;
import java.io.IOException;
import android.view.InflateException;
import android.util.Xml;
import android.content.ContextWrapper;
import android.app.Activity;
import android.content.res.TypedArray;
import android.util.Log;
import android.view.Menu;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;
import android.content.Context;
import android.view.MenuInflater;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ht extends MenuInflater
{
    static final Class[] a;
    static final Class[] b;
    final Object[] c;
    final Object[] d;
    final Context e;
    public Object f;
    
    static {
        b = (a = new Class[] { Context.class });
    }
    
    public ht(final Context e) {
        super(e);
        this.e = e;
        final Object[] array = { e };
        this.c = array;
        this.d = array;
    }
    
    private final void b(final XmlPullParser xmlPullParser, final AttributeSet set, final Menu menu) {
        final hs hs = new hs(this, menu);
        int i = xmlPullParser.getEventType();
        String name3;
        while (true) {
            while (i != 2) {
                i = xmlPullParser.next();
                if (i == 1) {
                    int j = 0;
                    int n = 0;
                    Object o = null;
                    int next = i;
                    while (j == 0) {
                        if (next == 1) {
                            throw new RuntimeException("Unexpected end of document");
                        }
                        int n2 = 0;
                        Label_0932: {
                            if (next != 2) {
                                if (next == 3) {
                                    final String name = xmlPullParser.getName();
                                    if (n != 0 && name.equals(o)) {
                                        n2 = 0;
                                        o = null;
                                        break Label_0932;
                                    }
                                    if (name.equals("group")) {
                                        hs.c();
                                    }
                                    else if (name.equals("item")) {
                                        if (!hs.h) {
                                            final akx a = hs.A;
                                            if (a != null && a.c()) {
                                                hs.a();
                                            }
                                            else {
                                                hs.h = true;
                                                hs.d(hs.a.add(hs.b, hs.i, hs.j, hs.k));
                                            }
                                        }
                                    }
                                    else if (name.equals("menu")) {
                                        j = 1;
                                        n2 = n;
                                        break Label_0932;
                                    }
                                }
                            }
                            else if (n == 0) {
                                final String name2 = xmlPullParser.getName();
                                if (name2.equals("group")) {
                                    final TypedArray obtainStyledAttributes = hs.F.e.obtainStyledAttributes(set, gl.p);
                                    hs.b = obtainStyledAttributes.getResourceId(1, 0);
                                    hs.c = obtainStyledAttributes.getInt(3, 0);
                                    hs.d = obtainStyledAttributes.getInt(4, 0);
                                    hs.e = obtainStyledAttributes.getInt(5, 0);
                                    hs.f = obtainStyledAttributes.getBoolean(2, true);
                                    hs.g = obtainStyledAttributes.getBoolean(0, true);
                                    obtainStyledAttributes.recycle();
                                }
                                else {
                                    if (name2.equals("item")) {
                                        final cdo v = cdo.v(hs.F.e, set, gl.q);
                                        hs.i = v.i(2, 0);
                                        hs.j = ((v.f(5, hs.c) & 0xFFFF0000) | (char)v.f(6, hs.d));
                                        hs.k = v.m(7);
                                        hs.l = v.m(8);
                                        hs.m = v.i(0, 0);
                                        hs.n = hs.e(v.n(9));
                                        hs.o = v.f(16, 4096);
                                        hs.p = hs.e(v.n(10));
                                        hs.q = v.f(20, 4096);
                                        if (v.q(11)) {
                                            hs.r = (v.p(11, false) ? 1 : 0);
                                        }
                                        else {
                                            hs.r = hs.e;
                                        }
                                        hs.s = v.p(3, false);
                                        hs.t = v.p(4, hs.f);
                                        hs.u = v.p(1, hs.g);
                                        hs.v = v.f(21, -1);
                                        hs.z = v.n(12);
                                        hs.w = v.i(13, 0);
                                        hs.x = v.n(15);
                                        hs.y = v.n(14);
                                        final String y = hs.y;
                                        Label_0785: {
                                            if (y != null) {
                                                if (hs.w == 0 && hs.x == null) {
                                                    hs.A = (akx)hs.b(y, ht.b, hs.F.d);
                                                    break Label_0785;
                                                }
                                                Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                                            }
                                            hs.A = null;
                                        }
                                        hs.B = v.m(17);
                                        hs.C = v.m(22);
                                        if (v.q(19)) {
                                            hs.E = mb.a(v.f(19, -1), hs.E);
                                        }
                                        else {
                                            hs.E = null;
                                        }
                                        if (v.q(18)) {
                                            hs.D = v.j(18);
                                        }
                                        else {
                                            hs.D = null;
                                        }
                                        v.o();
                                        hs.h = false;
                                        n2 = n;
                                        break Label_0932;
                                    }
                                    if (name2.equals("menu")) {
                                        this.b(xmlPullParser, set, (Menu)hs.a());
                                        n2 = n;
                                        break Label_0932;
                                    }
                                    o = name2;
                                    n2 = 1;
                                    break Label_0932;
                                }
                            }
                            n2 = n;
                        }
                        next = xmlPullParser.next();
                        n = n2;
                    }
                    return;
                }
            }
            name3 = xmlPullParser.getName();
            if (name3.equals("menu")) {
                i = xmlPullParser.next();
                continue;
            }
            break;
        }
        throw new RuntimeException("Expecting menu, got ".concat(String.valueOf(name3)));
    }
    
    public final Object a(final Object o) {
        if (o instanceof Activity) {
            return o;
        }
        Object a = o;
        if (o instanceof ContextWrapper) {
            a = this.a(((ContextWrapper)o).getBaseContext());
        }
        return a;
    }
    
    public final void inflate(final int n, final Menu menu) {
        if (menu instanceof ajd) {
            XmlResourceParser layout = null;
            try {
                try {
                    final XmlResourceParser xmlResourceParser2;
                    final XmlResourceParser xmlResourceParser = xmlResourceParser2 = (layout = this.e.getResources().getLayout(n));
                    this.b((XmlPullParser)xmlResourceParser, Xml.asAttributeSet((XmlPullParser)xmlResourceParser), menu);
                    if (xmlResourceParser != null) {
                        xmlResourceParser.close();
                    }
                    return;
                }
                finally {
                    if (layout != null) {
                        layout.close();
                    }
                    final IOException ex;
                    throw new InflateException("Error inflating menu XML", (Throwable)ex);
                }
            }
            catch (final IOException ex2) {}
            catch (final XmlPullParserException ex3) {}
        }
        super.inflate(n, menu);
    }
}
