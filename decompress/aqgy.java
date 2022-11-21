import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqgy extends ahcu implements ahcv
{
    public static final aqgy a;
    private static volatile ahev r;
    public int b;
    public int c;
    public Object d;
    public int e;
    public int f;
    public String g;
    public float h;
    public aqgx i;
    public int j;
    public int k;
    public boolean m;
    public aqgz n;
    public float o;
    public int p;
    public int q;
    private byte s;
    
    static {
        ahcz.registerDefaultInstance(aqgy.class, (ahcz)(a = new aqgy()));
    }
    
    private aqgy() {
        this.c = 0;
        this.s = 2;
        this.g = "";
    }
    
    public static void a(final aqgy aqgy) {
        aqgy.b |= 0x800;
        aqgy.m = true;
    }
    
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte s = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev r;
                if ((r = aqgy.r) == null) {
                    synchronized (aqgy.class) {
                        if (aqgy.r == null) {
                            aqgy.r = (ahev)new ahcs((ahcz)aqgy.a);
                        }
                    }
                }
                return r;
            }
            case 5: {
                return aqgy.a;
            }
            case 4: {
                return new ahct((ahcu)aqgy.a);
            }
            case 3: {
                return new aqgy();
            }
            case 2: {
                final ahdf h = aqdx.h;
                return newMessageInfo((MessageLite)aqgy.a, "\u0001\u000e\u0001\u0001\u0001\u0012\u000e\u0000\u0000\u0001\u0001\u100b\u0000\u0002\u100b\u0001\u0004\u1001\u0004\u0005\u100b\u0007\u0006\u100c\b\u0007\u103e\u0000\b\u103f\u0000\t\u1007\u000b\n\u1409\f\u000b\u1001\r\f\u100c\u000e\r\u100c\u000f\u000e\u1008\u0003\u0012\u1009\u0006", new Object[] { "d", "c", "b", "e", "f", "h", "j", "k", h, aqdx.f, "m", "n", "o", "p", h, "q", aqdx.e, "g", "i" });
            }
            case 1: {
                if (o == null) {
                    s = 0;
                }
                this.s = s;
                return null;
            }
            case 0: {
                return this.s;
            }
        }
    }
}
