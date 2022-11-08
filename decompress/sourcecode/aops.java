import com.google.protobuf.MessageLite;
import com.google.protos.youtube.api.innertube.RegisterTasksCommandOuterClass$RegisterTasksCommand;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aops extends agzi implements ahax
{
    public static final aops a;
    public static final agzg b;
    private static volatile ahbe d;
    public RegisterTasksCommandOuterClass$RegisterTasksCommand c;
    private int e;
    private byte f;
    
    static {
        final aops a2 = new aops();
        agzi.registerDefaultInstance((Class)aops.class, (agzi)(a = a2));
        b = agzi.newSingularGeneratedExtension((MessageLite)ajtl.a, (Object)a2, (MessageLite)a2, (agzn)null, 3, ahcm.k, (Class)aops.class);
    }
    
    private aops() {
        this.f = 2;
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
                final ahbe d;
                if ((d = aops.d) == null) {
                    synchronized (aops.class) {
                        if (aops.d == null) {
                            aops.d = (ahbe)new agzb((agzi)aops.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aops.a;
            }
            case 4: {
                return new agza((agzi)aops.a);
            }
            case 3: {
                return new aops();
            }
            case 2: {
                return newMessageInfo((MessageLite)aops.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "e", "c" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.f = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
