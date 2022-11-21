import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akoy extends ahcz implements aheo
{
    public static final akoy a;
    private static volatile ahev m;
    public int b;
    public boolean c;
    public int d;
    public boolean e;
    public boolean f;
    public int g;
    public int h;
    public long i;
    public long j;
    public int k;
    public ahdp l;
    
    static {
        ahcz.registerDefaultInstance(akoy.class, a = new akoy());
    }
    
    private akoy() {
        this.l = ahcz.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev m;
                if ((m = akoy.m) == null) {
                    synchronized (akoy.class) {
                        if (akoy.m == null) {
                            akoy.m = (ahev)new ahcs((ahcz)akoy.a);
                        }
                    }
                }
                return m;
            }
            case 5: {
                return akoy.a;
            }
            case 4: {
                return new ahcr((boolean[][])null, (boolean[])null);
            }
            case 3: {
                return new akoy();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akoy.a, "\u0001\n\u0000\u0001\u0001\u000f\n\u0000\u0001\u0000\u0001\u1007\u0000\u0002\u1007\u0002\u0003\u100b\u0001\u0006\u1007\u0004\u0007\u1004\u0005\u000b\u1002\n\f\u1002\u000b\r\u100c\f\u000e\u001b\u000f\u1004\u0006", new Object[] { "b", "c", "e", "d", "f", "g", "i", "j", "k", amsb.l, "l", akox.class, "h" });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
