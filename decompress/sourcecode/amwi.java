import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amwi extends agzi implements ahax
{
    public static final amwi a;
    private static volatile ahbe h;
    public int b;
    public int c;
    public Object d;
    public int e;
    public amwk f;
    public aioe g;
    private byte i;
    
    static {
        agzi.registerDefaultInstance(amwi.class, a = new amwi());
    }
    
    private amwi() {
        this.c = 0;
        this.i = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe h;
                if ((h = amwi.h) == null) {
                    synchronized (amwi.class) {
                        if (amwi.h == null) {
                            amwi.h = (ahbe)new agzb((agzi)amwi.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return amwi.a;
            }
            case 4: {
                return new agza((agzi)amwi.a);
            }
            case 3: {
                return new amwi();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)amwi.a, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0002\u0001\u143c\u0000\u0002\u1009\u0003\u0003\u1409\u0004\u0004\u1004\u0000\u0005\u103d\u0000", new Object[] { "d", "c", "b", amwm.class, "f", "g", "e" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.i = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
