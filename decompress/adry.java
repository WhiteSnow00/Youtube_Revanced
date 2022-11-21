import java.util.function.Consumer;
import java.util.Set;
import android.view.ViewGroup$MarginLayoutParams;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import android.view.View;
import android.util.Base64;
import java.util.Iterator;
import java.util.Collection;
import j$.util.Optional;
import java.util.Map;
import android.text.TextUtils;
import android.widget.TextView;
import android.view.ViewStub;
import android.content.Context;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adry
{
    public final Object a;
    public Object b;
    public Object c;
    
    public adry() {
        this.a = new ArrayList();
        this.c = null;
        final String a = omh.a;
        final int incrementAndGet = omh.b.incrementAndGet();
        final StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.append(incrementAndGet);
        this.b = sb.toString();
    }
    
    public adry(final aiic a) {
        a.getClass();
        this.a = a;
    }
    
    public adry(final akit a) {
        this.a = a;
    }
    
    public adry(final akli a) {
        a.getClass();
        this.a = a;
    }
    
    public adry(final Context a) {
        final afag a2 = afag.a;
        this.b = a2;
        this.c = a2;
        this.a = a;
    }
    
    private adry(final ViewStub b, final Class a) {
        this.a = a;
        b.getClass();
        this.b = b;
        this.c = null;
    }
    
    public adry(final TextView a) {
        this.c = afag.a;
        this.b = afgh.q();
        this.a = a;
    }
    
    public adry(final String s) {
        adme.K(TextUtils.isEmpty((CharSequence)s) ^ true);
        this.a = wbe.y(s, ((ahcz)akli.a).getParserForType());
    }
    
    public adry(final Map a) {
        this.a = a;
    }
    
    public adry(final qep a, final byte[] array, final byte[] array2) {
        this.c = Optional.empty();
        this.a = a;
        this.b = afkg.a;
    }
    
    public adry(final twp a) {
        this.b = "-";
        this.c = "-";
        this.a = a;
    }
    
    public static adry f(final ViewStub viewStub, final Class clazz) {
        return new adry(viewStub, clazz);
    }
    
    private final void m(final float n) {
        final Object a = this.a;
        String text;
        final String s = text = (String)agpx.au((Iterable)this.b);
        if (n > 0.0f) {
            final Object b = this.b;
            int n2;
            if (b instanceof Collection) {
                n2 = ((Collection)b).size();
            }
            else {
                final Iterator iterator = ((Iterable)b).iterator();
                long n3 = 0L;
                while (iterator.hasNext()) {
                    iterator.next();
                    ++n3;
                }
                n2 = afxr.F(n3);
            }
            if (n2 <= 1) {
                text = s;
            }
            else {
                text = (String)agpx.ah((Iterable)this.b, (afbk)new pxm(((TextView)a).getPaint(), n)).a(afbh.j(s)).f();
            }
        }
        if (text != null && text.contentEquals(((TextView)this.a).getText())) {
            return;
        }
        ((TextView)this.a).setText((CharSequence)text);
    }
    
    public final void a(final ahkt ahkt) {
        if (ahkt == null) {
            this.c = "-";
        }
        else {
            this.c = Base64.encodeToString(ahkt.toByteArray(), 11);
        }
        final absp absp = (absp)((twp)this.a).a();
        if (absp != null) {
            absp.t();
        }
    }
    
    public final vpf b() {
        if (this.b == null) {
            aiib aiib;
            if ((aiib = ((aiic)this.a).d) == null) {
                aiib = aiib.a;
            }
            if ((aiib.b & 0x2) != 0x0) {
                aiib aiib2;
                if ((aiib2 = ((aiic)this.a).d) == null) {
                    aiib2 = aiib.a;
                }
                aiie aiie;
                if ((aiie = aiib2.d) == null) {
                    aiie = aiie.a;
                }
                this.b = new vpf(aiie);
            }
        }
        return (vpf)this.b;
    }
    
    public final aiih c() {
        aiib aiib;
        if ((aiib = ((aiic)this.a).d) == null) {
            aiib = aiib.a;
        }
        if ((aiib.b & 0x1) != 0x0) {
            aiib aiib2;
            if ((aiib2 = ((aiic)this.a).d) == null) {
                aiib2 = aiib.a;
            }
            aiih aiih;
            if ((aiih = aiib2.c) == null) {
                aiih = aiih.a;
            }
            return aiih;
        }
        return null;
    }
    
    public final View d() {
        if (this.c == null) {
            final View c = ((Class<View>)this.a).cast(((ViewStub)this.b).inflate());
            c.getClass();
            this.c = c;
            this.b = null;
        }
        return (View)this.c;
    }
    
    public final boolean e() {
        return this.c != null;
    }
    
    public final byte[] g() {
        return ((akli)this.a).f.I();
    }
    
    public final List h() {
        if (this.c == null) {
            final LinkedList list = new LinkedList();
            for (final akiu akiu : ((akit)this.a).c) {
                if (akiu.b == 77108254) {
                    for (final ahln ahln : ((ahlo)akiu.c).c) {
                        if (ahln.b == 63434476) {
                            for (final ahlk ahlk : ((ahll)ahln.c).b) {
                                if (ahlk.b == 62381864) {
                                    final vob vob = new vob((ahlh)ahlk.c);
                                    vob.a().getClass();
                                    if (((ahcu)vob.d()).ry((ahci)aobj.b)) {
                                        continue;
                                    }
                                    if (vob.l()) {
                                        if (vob.n()) {
                                            twd.n(vob.k());
                                        }
                                        else {
                                            twd.n(vob.i());
                                        }
                                    }
                                    list.add(vob);
                                }
                            }
                        }
                    }
                }
            }
            this.c = Collections.unmodifiableList((List<?>)list);
        }
        return (List)this.c;
    }
    
    public final void i(final afgh afgh) {
        this.b = agpx.ai(afgh, (afbk)oqb.d);
        if (((afbh)this.c).h()) {
            this.m((float)((afbh)this.c).c());
        }
    }
    
    public final void j(final int n) {
        final Object a = this.a;
        final TextView textView = (TextView)a;
        final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)textView.getLayoutParams();
        final View view = (View)textView.getParent();
        final int paddingLeft = view.getPaddingLeft();
        final int paddingRight = view.getPaddingRight();
        final int leftMargin = viewGroup$MarginLayoutParams.leftMargin;
        final int rightMargin = viewGroup$MarginLayoutParams.rightMargin;
        final int paddingLeft2 = textView.getPaddingLeft();
        final int paddingRight2 = textView.getPaddingRight();
        if (a instanceof advz) {
            final advz advz = (advz)a;
            throw null;
        }
        final float n2 = (float)(paddingLeft + paddingRight + leftMargin + rightMargin + paddingLeft2 + paddingRight2);
        final float n3 = (float)n;
        final boolean h = ((afbh)this.c).h();
        final float n4 = n3 - n2;
        if (h && n4 == (float)((afbh)this.c).c()) {
            return;
        }
        this.c = afbh.k(n4);
        this.m(n4);
    }
    
    public final Set k() {
        final Object b = this.b;
        if (b != null) {
            return (Set)b;
        }
        return (Set)afkg.a;
    }
    
    public final void l(final long n) {
        ((Optional)this.c).ifPresentOrElse((Consumer)new uey(n, 1), (Runnable)new rke(this, 17, (byte[])null, (byte[])null));
    }
}
