import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class aqbh extends ahcz implements aheo
{
    public static final aqbh a;
    public static final ahcx b;
    private static volatile ahev i;
    public int c;
    public String d;
    public String e;
    public String f;
    public String g;
    public long h;
    
    static {
        final aqbh a2 = new aqbh();
        ahcz.registerDefaultInstance(aqbh.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)ajsd.a, a2, (MessageLite)a2, null, 155, ahgc.k, aqbh.class);
    }
    
    private aqbh() {
        this.d = "";
        final ahbt b = ahbt.b;
        this.e = "";
        this.f = "";
        this.g = "";
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
                if ((i = aqbh.i) == null) {
                    synchronized (aqbh.class) {
                        if (aqbh.i == null) {
                            aqbh.i = (ahev)new ahcs((ahcz)aqbh.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return aqbh.a;
            }
            case 4: {
                return new ahcr((ahcz)aqbh.a);
            }
            case 3: {
                return new aqbh();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqbh.a, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0000\u0001\u1008\u0000\u0003\u1008\u0002\u0005\u1008\u0003\u0006\u1008\u0004\u0007\u1002\u0005", new Object[] { "c", "d", "e", "f", "g", "h" });
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
