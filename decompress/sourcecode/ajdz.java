import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajdz extends agzi implements ahax
{
    public static final ajdz a;
    public static final agzg b;
    private static volatile ahbe j;
    public int c;
    public aqcz d;
    public ajdw e;
    public ajea f;
    public String g;
    public ajdu h;
    public ajdx i;
    private CommandOuterClass$Command k;
    private aqbw l;
    private ahfw m;
    private byte n;
    
    static {
        final ajdz a2 = new ajdz();
        agzi.registerDefaultInstance(ajdz.class, a = a2);
        b = agzi.newSingularGeneratedExtension((MessageLite)aqcu.a, a2, (MessageLite)a2, null, 355246692, ahcm.k, ajdz.class);
    }
    
    private ajdz() {
        this.n = 2;
        emptyProtobufList();
        emptyProtobufList();
        this.g = "";
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
                final ahbe j;
                if ((j = ajdz.j) == null) {
                    synchronized (ajdz.class) {
                        if (ajdz.j == null) {
                            ajdz.j = (ahbe)new agzb((agzi)ajdz.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return ajdz.a;
            }
            case 4: {
                return new agza((agzi)ajdz.a);
            }
            case 3: {
                return new ajdz();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajdz.a, "\u0001\t\u0000\u0001\u0003%\t\u0000\u0000\u0004\u0003\u1008\u0012\u0006\u1409\u0007\u000f\u1009\u000b\u0011\u1009\u0011\u0018\u1409\n \u1009\f#\u1009\u001d$\u1409\u001e%\u1409\u001f", new Object[] { "c", "g", "k", "e", "f", "d", "l", "h", "i", "m" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.n = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.n;
            }
        }
    }
}
