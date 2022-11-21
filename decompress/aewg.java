import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aewg extends ahcz implements aheo
{
    public static final aewg a;
    private static volatile ahev j;
    public int b;
    public long c;
    public long d;
    public ahdp e;
    public long f;
    public long g;
    public aetv h;
    public int i;
    
    static {
        ahcz.registerDefaultInstance(aewg.class, a = new aewg());
    }
    
    private aewg() {
        this.e = ahcz.emptyProtobufList();
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
                if ((j = aewg.j) == null) {
                    synchronized (aewg.class) {
                        if (aewg.j == null) {
                            aewg.j = (ahev)new ahcs((ahcz)aewg.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return aewg.a;
            }
            case 4: {
                return new ahcr((ahcz)aewg.a);
            }
            case 3: {
                return new aewg();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aewg.a, "\u0001\u0007\u0000\u0001\u0001\u000b\u0007\u0000\u0001\u0000\u0001\u1005\u0000\u0002\u1005\u0001\u0003\u001b\u0004\u1002\u0002\u0005\u1002\u0003\n\u1009\u0005\u000b\u100c\u0006", new Object[] { "b", "c", "d", "e", aeuw.class, "f", "g", "h", "i", aemb.d });
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
