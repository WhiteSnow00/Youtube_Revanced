import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akyl extends ahcz implements aheo
{
    public static final akyl a;
    private static volatile ahev e;
    public int b;
    public String c;
    public ahdp d;
    
    static {
        ahcz.registerDefaultInstance(akyl.class, a = new akyl());
    }
    
    private akyl() {
        this.c = "";
        this.d = ahcz.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev e;
                if ((e = akyl.e) == null) {
                    synchronized (akyl.class) {
                        if (akyl.e == null) {
                            akyl.e = (ahev)new ahcs((ahcz)akyl.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return akyl.a;
            }
            case 4: {
                return new ahcr((char[])null, (char[][])null);
            }
            case 3: {
                return new akyl();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akyl.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u001b", new Object[] { "b", "c", "d", akyh.class });
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
