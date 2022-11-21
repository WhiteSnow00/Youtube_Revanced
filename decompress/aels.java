import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aels extends ahcu implements ahcv
{
    public static final aels a;
    private static volatile ahev j;
    public int b;
    public String c;
    public String d;
    public String e;
    public String f;
    public boolean g;
    public String h;
    public String i;
    private byte k;
    
    static {
        ahcz.registerDefaultInstance(aels.class, (ahcz)(a = new aels()));
    }
    
    private aels() {
        this.k = 2;
        this.c = "";
        this.d = "";
        this.e = "";
        this.f = "";
        this.h = "";
        this.i = "";
    }
    
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte k = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev j;
                if ((j = aels.j) == null) {
                    synchronized (aels.class) {
                        if (aels.j == null) {
                            aels.j = (ahev)new ahcs((ahcz)aels.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return aels.a;
            }
            case 4: {
                return new ahct((ahcu)aels.a);
            }
            case 3: {
                return new aels();
            }
            case 2: {
                return newMessageInfo((MessageLite)aels.a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1008\u0004\u0004\u1008\u0005\u0005\u1007\u0006\u0006\u1008\u0007\u0007\u1008\b", new Object[] { "b", "c", "d", "e", "f", "g", "h", "i" });
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
