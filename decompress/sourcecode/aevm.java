import android.text.Spanned;
import android.text.SpannedString;
import android.content.Context;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.android.libraries.blocks.runtime.InstanceProxy;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aevm extends InstanceProxy
{
    public final aevl a;
    
    public aevm(final aevl a) {
        this.a = a;
    }
    
    @Override
    public final ListenableFuture a(final int n, final byte[] array) {
        final StringBuilder sb = new StringBuilder("No method found with identifier: ");
        sb.append(n);
        throw new IllegalArgumentException(sb.toString());
    }
    
    @Override
    public final void b(final int n, final long n2, final byte[] array) {
        final StringBuilder sb = new StringBuilder("No method found with identifier: ");
        sb.append(n);
        throw new IllegalArgumentException(sb.toString());
    }
    
    @Override
    public final void c() {
    }
    
    @Override
    public final boolean d(final int n) {
        return n == 854136778 || n == 581992393;
    }
    
    @Override
    public final byte[] e(int n, final byte[] array) {
        if (n == 854136778) {
            final aqls aqls = (aqls)agzi.parseFrom((agzi)aqls.a, array, ExtensionRegistryLite.getGeneratedRegistry());
            final aevl a = this.a;
            final String[] array2 = aqls.c.toArray(new String[0]);
            final aexq aexq = (aexq)a.f;
            Object o = null;
            Label_0709: {
                if (aexq.h()) {
                    final ezp ezp = (ezp)aexq.c();
                    final long b = aqls.b;
                    if (b == 5422968216302619107L) {
                        o = aexq.k(2132017919);
                        break Label_0709;
                    }
                    if (b == 2626157110517125101L) {
                        o = aexq.k(2132017936);
                        break Label_0709;
                    }
                    if (b == 142716979790702555L) {
                        o = aexq.k(2132017947);
                        break Label_0709;
                    }
                    if (b == 1459585803258417307L) {
                        o = aexq.k(2132017939);
                        break Label_0709;
                    }
                    if (b == 1577698717541496139L) {
                        o = aexq.k(2132017940);
                        break Label_0709;
                    }
                    if (b == 1251420299201246860L) {
                        o = aexq.k(2132017941);
                        break Label_0709;
                    }
                    if (b == 3481398137122180040L) {
                        o = aexq.k(2132017943);
                        break Label_0709;
                    }
                    if (b == 5638707866132368702L) {
                        o = aexq.k(2132017944);
                        break Label_0709;
                    }
                    if (b == 135743861921471287L) {
                        o = aexq.k(2132017942);
                        break Label_0709;
                    }
                    if (b == 96305683315366657L) {
                        o = aexq.k(2132017938);
                        break Label_0709;
                    }
                    if (b == 1119633521376903032L) {
                        o = aexq.k(2132017937);
                        break Label_0709;
                    }
                    if (b == 7894323363180674458L) {
                        o = aexq.k(2132017917);
                        break Label_0709;
                    }
                    if (b == 3844716358074324423L) {
                        o = aexq.k(2132017930);
                        break Label_0709;
                    }
                    if (b == 1054277391184941073L) {
                        o = aexq.k(2132017931);
                        break Label_0709;
                    }
                    if (b == 3478731670297301255L) {
                        o = aexq.k(2132017934);
                        break Label_0709;
                    }
                    if (b == 8900890038567443983L) {
                        o = aexq.k(2132017933);
                        break Label_0709;
                    }
                    if (b == 1037205937746246286L) {
                        o = aexq.k(2132017932);
                        break Label_0709;
                    }
                    if (b == 1923179683648050350L) {
                        o = aexq.k(2132017935);
                        break Label_0709;
                    }
                    if (b == 305737489042844827L) {
                        o = aexq.k(2132017925);
                        break Label_0709;
                    }
                    if (b == 4176858769769104693L) {
                        o = aexq.k(2132017922);
                        break Label_0709;
                    }
                    if (b == 8607904452155977135L) {
                        o = aexq.k(2132017923);
                        break Label_0709;
                    }
                    if (b == 9168535691527532784L) {
                        o = aexq.k(2132017924);
                        break Label_0709;
                    }
                    if (b == 7399416205141698402L) {
                        o = aexq.k(2132017945);
                        break Label_0709;
                    }
                    if (b == 4223299001294159006L) {
                        o = aexq.k(2132017927);
                        break Label_0709;
                    }
                    if (b == 425192378151202949L) {
                        o = aexq.k(2132017928);
                        break Label_0709;
                    }
                    if (b == 4758009570459172942L) {
                        o = aexq.k(2132017929);
                        break Label_0709;
                    }
                    if (b == 589883595698260992L) {
                        o = aexq.k(2132017920);
                        break Label_0709;
                    }
                    if (b == 8926405549189359051L) {
                        o = aexq.k(2132017946);
                        break Label_0709;
                    }
                    if (b == 7364511387167169615L) {
                        o = aexq.k(2132017921);
                        break Label_0709;
                    }
                    if (b == 5450108496265674348L) {
                        o = aexq.k(2132017926);
                        break Label_0709;
                    }
                }
                o = aewp.a;
            }
            Spanned spanned;
            if (((aexq)o).h()) {
                final Object g = a.g;
                n = (int)((aexq)o).c();
                spanned = mrm.S(aey.f((Spanned)new SpannedString(((Context)((mrm)g).a).getText(n))), (Object[])array2);
            }
            else {
                spanned = mrm.S(aqls.d, (Object[])array2);
            }
            final agza builder = ((agzi)aqlt.a).createBuilder();
            final aqbm n2 = szb.n(spanned);
            builder.copyOnWrite();
            final aqlt aqlt = (aqlt)builder.instance;
            n2.getClass();
            aqlt.c = n2;
            aqlt.b |= 0x1;
            return ((agxl)builder.build()).toByteArray();
        }
        if (n == 581992393) {
            final aqlr aqlr = (aqlr)agzi.parseFrom((agzi)aqlr.a, array, ExtensionRegistryLite.getGeneratedRegistry());
            final aevl a2 = this.a;
            final String[] array3 = aqlr.d.toArray(new String[0]);
            final aexq aexq2 = (aexq)a2.f;
            Object o2;
            if (aexq2.h()) {
                final ezp ezp2 = (ezp)aexq2.c();
                final long b2 = aqlr.b;
                if (b2 == 7012817313426365545L) {
                    o2 = aexq.k(2131886100);
                }
                else if (b2 == 8471273943394326121L) {
                    o2 = aexq.k(2131886101);
                }
                else if (b2 == 9135372632370637675L) {
                    o2 = aexq.k(2131886102);
                }
                else if (b2 == 4107219054527973414L) {
                    o2 = aexq.k(2131886097);
                }
                else if (b2 == 2088433316520623004L) {
                    o2 = aexq.k(2131886098);
                }
                else if (b2 == 4242114180910222184L) {
                    o2 = aexq.k(2131886099);
                }
                else {
                    o2 = aewp.a;
                }
            }
            else {
                o2 = aewp.a;
            }
            Spanned spanned2;
            if (((aexq)o2).h()) {
                final Object g2 = a2.g;
                n = (int)((aexq)o2).c();
                spanned2 = mrm.Q(aey.e(mrm.R(aey.f((Spanned)new SpannedString(((Context)((mrm)g2).a).getResources().getQuantityText(n, (int)aqlr.c))), (Object[])array3)));
            }
            else {
                spanned2 = mrm.S(aqlr.e, (Object[])array3);
            }
            final agza builder2 = ((agzi)aqlt.a).createBuilder();
            final aqbm n3 = szb.n(spanned2);
            builder2.copyOnWrite();
            final aqlt aqlt2 = (aqlt)builder2.instance;
            n3.getClass();
            aqlt2.c = n3;
            aqlt2.b |= 0x1;
            return ((agxl)builder2.build()).toByteArray();
        }
        final StringBuilder sb = new StringBuilder("No method found with identifier: ");
        sb.append(n);
        throw new IllegalArgumentException(sb.toString());
    }
    
    @Override
    public final void f(final int n) {
        final StringBuilder sb = new StringBuilder("No method found with identifier: ");
        sb.append(n);
        throw new IllegalArgumentException(sb.toString());
    }
    
    @Override
    public final ListenableFuture g(final int n) {
        final StringBuilder sb = new StringBuilder("No method found with identifier: ");
        sb.append(n);
        throw new IllegalArgumentException(sb.toString());
    }
}
