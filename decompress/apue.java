import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apue extends ahcz implements aheo
{
    public static final apue a;
    private static volatile ahev e;
    public int b;
    public ahdp c;
    public int d;
    private ahjl f;
    private byte g;
    
    static {
        ahcz.registerDefaultInstance(apue.class, a = new apue());
    }
    
    private apue() {
        this.g = 2;
        this.c = ahcz.emptyProtobufList();
        emptyProtobufList();
        final ahbt b = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev e;
                if ((e = apue.e) == null) {
                    synchronized (apue.class) {
                        if (apue.e == null) {
                            apue.e = (ahev)new ahcs((ahcz)apue.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return apue.a;
            }
            case 4: {
                return new ahcr((ahcz)apue.a);
            }
            case 3: {
                return new apue();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apue.a, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0001\u0002\u0001\u041b\u0003\u1409\u0001\u0005\u1004\u0000", new Object[] { "b", "c", aptw.class, "f", "d" });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
