// 
// Decompiled by Procyon v0.6.0
// 

public final class atwx implements atxe
{
    private final atqh a;
    
    public atwx() {
    }
    
    public atwx(final atqh a) {
        this.a = a;
    }
    
    public final Object a(atxf a, final atov atov) {
        atww atww2 = null;
        Label_0051: {
            if (atov instanceof atww) {
                final atww atww = (atww)atov;
                final int d = atww.d;
                if ((d & Integer.MIN_VALUE) != 0x0) {
                    atww.d = d + Integer.MIN_VALUE;
                    atww2 = atww;
                    break Label_0051;
                }
            }
            atww2 = new atww(this, atov);
        }
        final Object b = atww2.b;
        final atpc a2 = atpc.a;
        final int d2 = atww2.d;
        Object o = null;
        Label_0173: {
            if (d2 != 0) {
                if (d2 == 1) {
                    a = (atxf)atww2.a;
                    try {
                        areq.I(b);
                        break Label_0173;
                    }
                    finally {
                        o = a;
                        final atxf atxf;
                        a = atxf;
                        break Label_0173;
                    }
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            areq.I(b);
            a = (atxf)new atxt(a, ((atov)atww2).getContext());
            try {
                atww2.a = a;
                atww2.d = 1;
                Object o2;
                if ((o2 = this.a.invoke(a, atww2)) != atpc.a) {
                    o2 = atnn.a;
                }
                if (o2 != a2) {
                    ((atxt)a).releaseIntercepted();
                    return atnn.a;
                }
                return a2;
            }
            finally {
                final atxf atxf2 = a;
                final atxf atxf3;
                a = atxf3;
                o = atxf2;
            }
        }
        ((atxt)o).releaseIntercepted();
        throw a;
    }
}
