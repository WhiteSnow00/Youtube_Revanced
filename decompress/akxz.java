import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akxz extends ahcz implements aheo
{
    public static final akxz a;
    private static volatile ahev g;
    public int b;
    public String c;
    public ahdp d;
    public ahbt e;
    public boolean f;
    
    static {
        ahcz.registerDefaultInstance(akxz.class, a = new akxz());
    }
    
    private akxz() {
        this.c = "";
        this.d = ahcz.emptyProtobufList();
        this.e = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev g;
                if ((g = akxz.g) == null) {
                    synchronized (akxz.class) {
                        if (akxz.g == null) {
                            akxz.g = (ahev)new ahcs((ahcz)akxz.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return akxz.a;
            }
            case 4: {
                return new ahcr((boolean[][][])null, (byte[])null);
            }
            case 3: {
                return new akxz();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akxz.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u001b\u0003\u100a\u0001\u0004\u1007\u0002", new Object[] { "b", "c", "d", akxy.class, "e", "f" });
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
