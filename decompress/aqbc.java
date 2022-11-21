import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class aqbc extends ahcz implements aheo
{
    public static final aqbc a;
    public static final ahcx b;
    private static volatile ahev i;
    public int c;
    public String d;
    public String e;
    public ahdp f;
    public long g;
    public long h;
    
    static {
        final aqbc a2 = new aqbc();
        ahcz.registerDefaultInstance(aqbc.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)ajsd.a, a2, (MessageLite)a2, null, 156, ahgc.k, aqbc.class);
    }
    
    private aqbc() {
        this.d = "";
        final ahbt b = ahbt.b;
        this.e = "";
        this.f = ahcz.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev i;
                if ((i = aqbc.i) == null) {
                    synchronized (aqbc.class) {
                        if (aqbc.i == null) {
                            aqbc.i = (ahev)new ahcs((ahcz)aqbc.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return aqbc.a;
            }
            case 4: {
                return new ahcr((ahcz)aqbc.a);
            }
            case 3: {
                return new aqbc();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqbc.a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0000\u0001\u1008\u0000\u0003\u1008\u0002\u0004\u001a\u0005\u1002\u0003\u0006\u1002\u0004", new Object[] { "c", "d", "e", "f", "g", "h" });
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
