import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apud extends ahcu implements ahcv
{
    public static final apud a;
    private static volatile ahev h;
    public int b;
    public ahdp c;
    public ahdp d;
    public ahdp e;
    public int f;
    public ahbt g;
    private ahjl i;
    private byte j;
    
    static {
        ahcz.registerDefaultInstance(apud.class, (ahcz)(a = new apud()));
    }
    
    private apud() {
        this.j = 2;
        this.c = emptyProtobufList();
        this.d = emptyProtobufList();
        this.e = emptyProtobufList();
        this.g = ahbt.b;
    }
    
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte j = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev h;
                if ((h = apud.h) == null) {
                    synchronized (apud.class) {
                        if (apud.h == null) {
                            apud.h = (ahev)new ahcs((ahcz)apud.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return apud.a;
            }
            case 4: {
                return new ahct((ahcu)apud.a);
            }
            case 3: {
                return new apud();
            }
            case 2: {
                return newMessageInfo((MessageLite)apud.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0003\u0004\u0001\u041b\u0002\u041b\u0003\u1409\u0001\u0004\u100a\u0002\u0005\u041b\u0006\u1004\u0000", new Object[] { "b", "c", aptw.class, "d", ajws.class, "i", "g", "e", ajws.class, "f" });
            }
            case 1: {
                if (o == null) {
                    j = 0;
                }
                this.j = j;
                return null;
            }
            case 0: {
                return this.j;
            }
        }
    }
}
