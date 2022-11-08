import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aope extends agzi implements ahax
{
    public static final aope a;
    private static volatile ahbe f;
    public int b;
    public ahib c;
    public aofa d;
    public aooz e;
    private aiiw g;
    private aofb h;
    private aovw i;
    private ajqj j;
    private byte k;
    
    static {
        agzi.registerDefaultInstance((Class)aope.class, (agzi)(a = new aope()));
    }
    
    private aope() {
        this.k = 2;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe f;
                if ((f = aope.f) == null) {
                    synchronized (aope.class) {
                        if (aope.f == null) {
                            aope.f = (ahbe)new agzb((agzi)aope.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aope.a;
            }
            case 4: {
                return new agza((agzi)aope.a);
            }
            case 3: {
                return new aope();
            }
            case 2: {
                return newMessageInfo((MessageLite)aope.a, "\u0001\u0007\u0000\u0001\ue9be\u24cf\ufe64\ub0f7\u0007\u0000\u0000\u0007\ue9be\u24cf\u1409\u0000\ue64a\u2909\u1409\u0002\uf9df\u2b4e\u1409\u0001\uf223\u367b\u1409\u0003\ue057\u4ac2\u1409\u0004\uecd7\u65bf\u1409\u0005\ufe64\ub0f7\u1409\u0006", new Object[] { "b", "c", "d", "g", "h", "i", "j", "e" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.k = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.k;
            }
        }
    }
}
