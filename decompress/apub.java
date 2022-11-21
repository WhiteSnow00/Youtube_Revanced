import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class apub extends ahcz implements aheo
{
    public static final apub a;
    private static volatile ahev l;
    public int b;
    public ajws c;
    public aisc d;
    public ahdp e;
    public aptp f;
    public aptz g;
    public aptw h;
    public boolean i;
    public ajws j;
    public ahbt k;
    private amiy m;
    private ahjl n;
    private byte o;
    
    static {
        ahcz.registerDefaultInstance(apub.class, a = new apub());
    }
    
    private apub() {
        this.o = 2;
        this.e = ahcz.emptyProtobufList();
        this.k = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte o3 = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev l;
                if ((l = apub.l) == null) {
                    synchronized (apub.class) {
                        if (apub.l == null) {
                            apub.l = (ahev)new ahcs((ahcz)apub.a);
                        }
                    }
                }
                return l;
            }
            case 5: {
                return apub.a;
            }
            case 4: {
                return new ahcr((ahcz)apub.a);
            }
            case 3: {
                return new apub();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apub.a, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0001\t\u0001\u1409\u0000\u0002\u1409\u0002\u0003\u041b\u0004\u1409\u0003\u0005\u1409\u0004\u0006\u1409\u0005\u0007\u1007\u0006\b\u1409\u0007\t\u1409\t\n\u100a\n\u000b\u1409\b", new Object[] { "b", "c", "d", "e", ajws.class, "f", "g", "h", "i", "j", "n", "k", "m" });
            }
            case 1: {
                if (o == null) {
                    o3 = 0;
                }
                this.o = o3;
                return null;
            }
            case 0: {
                return this.o;
            }
        }
    }
}
