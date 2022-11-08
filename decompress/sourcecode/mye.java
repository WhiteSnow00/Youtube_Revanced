import com.google.android.gms.gmscompliance.GmsDeviceComplianceResponse;
import com.google.protobuf.ExtensionRegistryLite;
import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mye
{
    private static final long a;
    
    static {
        a = TimeUnit.HOURS.toMillis(1L);
    }
    
    public static myb a(aexq b) {
        if (!b.h()) {
            return e(2);
        }
        b = b((agph)b.c());
        if (!b.h()) {
            return e(2);
        }
        final agpg agpg = (agpg)b.c();
        final agpe a = agpe.a;
        agpe agpe;
        if ((agpe = agpe.a(agpg.d)) == null) {
            agpe = agpe.a;
        }
        final int ordinal = agpe.ordinal();
        if (ordinal != 1) {
            int n;
            if (ordinal != 2) {
                n = 3;
            }
            else {
                n = 4;
            }
            return e(n);
        }
        return e(1);
    }
    
    public static aexq b(final agph agph) {
        Label_0035: {
            if ((agph.b & 0x1) == 0x0) {
                break Label_0035;
            }
            try {
                return aexq.k((Object)agzi.parseFrom(agpg.a, agph.c, ExtensionRegistryLite.getGeneratedRegistry()));
                return aewp.a;
            }
            catch (final ahab ahab) {
                return aewp.a;
            }
        }
    }
    
    public static aexq c(final GmsDeviceComplianceResponse gmsDeviceComplianceResponse) {
        final byte[] f = gmsDeviceComplianceResponse.f;
        Label_0030: {
            if (f == null) {
                break Label_0030;
            }
            try {
                return aexq.k((Object)agzi.parseFrom(agph.a, f, ExtensionRegistryLite.getGeneratedRegistry()));
                return aewp.a;
            }
            catch (final ahab ahab) {
                return aewp.a;
            }
        }
    }
    
    public static agph d(final GmsDeviceComplianceResponse gmsDeviceComplianceResponse) {
        final ahca c = ahdd.c(System.currentTimeMillis() + mye.a);
        agpe agpe;
        if (gmsDeviceComplianceResponse.b) {
            agpe = agpe.c;
        }
        else {
            agpe = agpe.b;
        }
        final agza builder = agph.a.createBuilder();
        final agza builder2 = agpg.a.createBuilder();
        builder2.copyOnWrite();
        final agpg agpg = (agpg)builder2.instance;
        agpg.d = agpe.d;
        agpg.b |= 0x2;
        builder2.copyOnWrite();
        final agpg agpg2 = (agpg)builder2.instance;
        c.getClass();
        agpg2.f = c;
        agpg2.b |= 0x8;
        final agyc byteString = builder2.build().toByteString();
        builder.copyOnWrite();
        final agph agph = (agph)builder.instance;
        agph.b |= 0x1;
        agph.c = byteString;
        return (agph)builder.build();
    }
    
    private static myb e(final int n) {
        return new myb(n);
    }
}
