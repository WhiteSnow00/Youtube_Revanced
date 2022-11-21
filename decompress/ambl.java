import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ambl extends ahcz implements aheo
{
    public static final ambl a;
    public static final ahcx b;
    private static volatile ahev n;
    public int c;
    public String d;
    public String e;
    public String f;
    public String g;
    public ajws h;
    public int i;
    public ahdp j;
    public ahdp k;
    public ahej l;
    public String m;
    private byte o;
    
    static {
        final ambl a2 = new ambl();
        ahcz.registerDefaultInstance(ambl.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)ajsd.a, a2, (MessageLite)a2, null, 306, ahgc.k, ambl.class);
    }
    
    private ambl() {
        this.l = ahej.a;
        this.o = 2;
        this.d = "";
        final ahbt b = ahbt.b;
        this.e = "";
        this.f = "";
        this.g = "";
        this.j = ahcz.emptyProtobufList();
        this.k = ahcz.emptyProtobufList();
        this.m = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte o3 = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev n;
                if ((n = ambl.n) == null) {
                    synchronized (ambl.class) {
                        if (ambl.n == null) {
                            ambl.n = (ahev)new ahcs((ahcz)ambl.a);
                        }
                    }
                }
                return n;
            }
            case 5: {
                return ambl.a;
            }
            case 4: {
                return new ahcr((short[][])null, (byte[][])null);
            }
            case 3: {
                return new ambl();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ambl.a, "\u0001\n\u0000\u0001\u0001\u000b\n\u0001\u0002\u0002\u0001\u1008\u0000\u0002\u1008\u0002\u0004\u1008\u0003\u0005\u1008\u0004\u0006\u1409\u0005\u0007\u100c\u0006\b\u001a\t\u001a\n\u0432\u000b\u1008\u0007", new Object[] { "c", "d", "e", "f", "g", "h", "i", aqbp.a(), "j", "k", "l", ambk.a, "m" });
            }
            case 1: {
                if (o == null) {
                    o3 = 0;
                }
                this.o = o3;
                return null;
            }
            case 0: {
                return this.o;
            }
        }
    }
}
