import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agtm extends ahcz implements aheo
{
    public static final agtm a;
    private static volatile ahev j;
    public int b;
    public ahdp c;
    public int d;
    public String e;
    public agto f;
    public agtp g;
    public String h;
    public boolean i;
    
    static {
        ahcz.registerDefaultInstance(agtm.class, a = new agtm());
    }
    
    private agtm() {
        this.c = ahcz.emptyProtobufList();
        this.e = "";
        this.h = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev j;
                if ((j = agtm.j) == null) {
                    synchronized (agtm.class) {
                        if (agtm.j == null) {
                            agtm.j = (ahev)new ahcs((ahcz)agtm.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return agtm.a;
            }
            case 4: {
                return new ahcr((ahcz)agtm.a);
            }
            case 3: {
                return new agtm();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)agtm.a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001\u001b\u0002\u100c\u0000\u0003\u1008\u0001\u0004\u1009\u0002\u0005\u1009\u0003\u0006\u1008\u0004\u0007\u1007\u0005", new Object[] { "b", "c", agtn.class, "d", afsd.j, "e", "f", "g", "h", "i" });
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
