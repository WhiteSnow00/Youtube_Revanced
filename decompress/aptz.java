import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class aptz extends ahcz implements aheo
{
    public static final aptz a;
    private static volatile ahev e;
    public int b;
    public ajws c;
    public ahdp d;
    private ahjl f;
    private byte g;
    
    static {
        ahcz.registerDefaultInstance(aptz.class, a = new aptz());
    }
    
    private aptz() {
        this.g = 2;
        this.d = ahcz.emptyProtobufList();
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
                if ((e = aptz.e) == null) {
                    synchronized (aptz.class) {
                        if (aptz.e == null) {
                            aptz.e = (ahev)new ahcs((ahcz)aptz.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aptz.a;
            }
            case 4: {
                return new ahcr((ahcz)aptz.a);
            }
            case 3: {
                return new aptz();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aptz.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0003\u0001\u1409\u0000\u0002\u041b\u0003\u1409\u0001", new Object[] { "b", "c", "d", apua.class, "f" });
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
