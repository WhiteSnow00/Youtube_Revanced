import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ardi extends ahcz implements aheo
{
    public static final ardi a;
    private static volatile ahev e;
    public int b;
    public String c;
    public ahdp d;
    
    static {
        ahcz.registerDefaultInstance(ardi.class, a = new ardi());
    }
    
    private ardi() {
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
                if ((e = ardi.e) == null) {
                    synchronized (ardi.class) {
                        if (ardi.e == null) {
                            ardi.e = (ahev)new ahcs((ahcz)ardi.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ardi.a;
            }
            case 4: {
                return new ahcr((short[])null, (byte[][][])null);
            }
            case 3: {
                return new ardi();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ardi.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u001a", new Object[] { "b", "c", "d" });
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
