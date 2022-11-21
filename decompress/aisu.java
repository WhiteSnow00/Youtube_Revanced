import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aisu extends ahcz implements aheo
{
    public static final aisu a;
    public static final ahcx b;
    private static volatile ahev l;
    public int c;
    public String d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public ahdp i;
    public boolean j;
    public boolean k;
    private byte m;
    
    static {
        final aisu a2 = new aisu();
        ahcz.registerDefaultInstance(aisu.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)ajsd.a, a2, (MessageLite)a2, null, 215, ahgc.k, aisu.class);
    }
    
    private aisu() {
        this.m = 2;
        this.d = "";
        this.i = ahcz.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte m = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev l;
                if ((l = aisu.l) == null) {
                    synchronized (aisu.class) {
                        if (aisu.l == null) {
                            aisu.l = (ahev)new ahcs((ahcz)aisu.a);
                        }
                    }
                }
                return l;
            }
            case 5: {
                return aisu.a;
            }
            case 4: {
                return new ahcr((ahcz)aisu.a);
            }
            case 3: {
                return new aisu();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aisu.a, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0001\u0001\u0001\u1008\u0000\u0002\u1007\u0006\u0004\u1007\u0001\u0005\u1007\u0003\u0006\u1007\u0004\u0007\u1007\u0005\b\u1007\u0002\t\u041b", new Object[] { "c", "d", "k", "e", "g", "h", "j", "f", "i", ajqe.class });
            }
            case 1: {
                if (o == null) {
                    m = 0;
                }
                this.m = m;
                return null;
            }
            case 0: {
                return this.m;
            }
        }
    }
}
