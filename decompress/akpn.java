import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akpn extends ahcz implements aheo
{
    public static final akpn a;
    private static volatile ahev e;
    public int b;
    public String c;
    public long d;
    
    static {
        ahcz.registerDefaultInstance(akpn.class, a = new akpn());
    }
    
    private akpn() {
        this.c = "";
        ahcz.emptyProtobufList();
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
                if ((e = akpn.e) == null) {
                    synchronized (akpn.class) {
                        if (akpn.e == null) {
                            akpn.e = (ahev)new ahcs((ahcz)akpn.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return akpn.a;
            }
            case 4: {
                return new ahcr((ahcz)akpn.a);
            }
            case 3: {
                return new akpn();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akpn.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1003\u0001", new Object[] { "b", "c", "d" });
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
