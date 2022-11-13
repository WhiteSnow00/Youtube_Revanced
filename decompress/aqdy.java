import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqdy extends ahbh implements ahcw
{
    public static final aqdy a;
    private static volatile ahdd j;
    public int b;
    public String c;
    public int d;
    public ahbx e;
    public ahbx f;
    public ahbx g;
    public ahbx h;
    public aqeb i;
    private byte k;
    
    static {
        ahbh.registerDefaultInstance((Class)aqdy.class, (ahbh)(a = new aqdy()));
    }
    
    private aqdy() {
        this.k = 2;
        this.c = "";
        this.e = emptyProtobufList();
        this.f = emptyProtobufList();
        this.g = emptyProtobufList();
        this.h = emptyProtobufList();
    }
    
    public final void a() {
        final ahbx f = this.f;
        if (!f.c()) {
            this.f = ahbh.mutableCopy(f);
        }
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte k = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd j;
                if ((j = aqdy.j) == null) {
                    synchronized (aqdy.class) {
                        if (aqdy.j == null) {
                            aqdy.j = (ahdd)new ahba((ahbh)aqdy.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return aqdy.a;
            }
            case 4: {
                return new ahaz((int[][])null, (byte[])null);
            }
            case 3: {
                return new aqdy();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqdy.a, "\u0001\u0007\u0000\u0001\u0001\u000b\u0007\u0000\u0004\u0004\u0001\u1008\u0000\u0003\u100c\u0002\u0005\u041b\u0006\u041b\b\u041b\n\u041b\u000b\u1009\u0006", new Object[] { "b", "c", "d", aqcl.h, "e", aqdz.class, "f", aqee.class, "g", aqdx.class, "h", aqea.class, "i" });
            }
            case 1: {
                if (o == null) {
                    k = 0;
                }
                this.k = k;
                return null;
            }
            case 0: {
                return this.k;
            }
        }
    }
}
