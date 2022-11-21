import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aexc extends ahcz implements aheo
{
    public static final aexc a;
    private static volatile ahev e;
    public int b;
    public String c;
    public ahbt d;
    
    static {
        ahcz.registerDefaultInstance(aexc.class, a = new aexc());
    }
    
    private aexc() {
        this.c = "";
        this.d = ahbt.b;
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
                if ((e = aexc.e) == null) {
                    synchronized (aexc.class) {
                        if (aexc.e == null) {
                            aexc.e = (ahev)new ahcs((ahcz)aexc.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aexc.a;
            }
            case 4: {
                return new ahcr((ahcz)aexc.a);
            }
            case 3: {
                return new aexc();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aexc.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u100a\u0001", new Object[] { "b", "c", "d" });
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
