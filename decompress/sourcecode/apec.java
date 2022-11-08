import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apec extends agzi implements ahax
{
    public static final apec a;
    public static final agzg b;
    private static volatile ahbe g;
    public int c;
    public agzy d;
    public String e;
    public aioe f;
    private byte h;
    
    static {
        final apec a2 = new apec();
        agzi.registerDefaultInstance(apec.class, a = a2);
        b = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, a2, (MessageLite)a2, null, 126705043, ahcm.k, apec.class);
    }
    
    private apec() {
        this.h = 2;
        this.d = agzi.emptyProtobufList();
        emptyProtobufList();
        this.e = "";
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
                final ahbe g;
                if ((g = apec.g) == null) {
                    synchronized (apec.class) {
                        if (apec.g == null) {
                            apec.g = (ahbe)new agzb((agzi)apec.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return apec.a;
            }
            case 4: {
                return new agza((agzi)apec.a);
            }
            case 3: {
                return new apec();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apec.a, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0001\u0001\u0001\u001b\u0004\u1008\u0000\u0005\u1409\u0001", new Object[] { "c", "d", akqb.class, "e", "f" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.h = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
