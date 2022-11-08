import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anii extends agzi implements ahax
{
    public static final anii a;
    public static final agzg b;
    private static volatile ahbe h;
    public int c;
    public agzy d;
    public agzy e;
    public String f;
    public boolean g;
    private aioe i;
    private anss j;
    private ahfw k;
    private byte l;
    
    static {
        final anii a2 = new anii();
        agzi.registerDefaultInstance(anii.class, a = a2);
        b = agzi.newSingularGeneratedExtension((MessageLite)ansr.a, a2, (MessageLite)a2, null, 54681060, ahcm.k, anii.class);
    }
    
    private anii() {
        this.l = 2;
        this.d = agzi.emptyProtobufList();
        this.e = agzi.emptyProtobufList();
        this.f = "";
        emptyProtobufList();
        final agyc b = agyc.b;
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe h;
                if ((h = anii.h) == null) {
                    synchronized (anii.class) {
                        if (anii.h == null) {
                            anii.h = (ahbe)new agzb((agzi)anii.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return anii.a;
            }
            case 4: {
                return new agza((short[][][])null, (float[][])null);
            }
            case 3: {
                return new anii();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)anii.a, "\u0001\u0007\u0000\u0001\u0001\f\u0007\u0000\u0002\u0005\u0001\u041b\u0002\u1008\u0000\u0004\u041b\u0005\u1007\u0002\b\u1409\u0005\u000b\u1409\u0003\f\u1409\u0004", new Object[] { "c", "d", anik.class, "f", "e", anij.class, "g", "k", "i", "j" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.l = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.l;
            }
        }
    }
}
