/*
 * Copyright 2019-2020 Mamoe Technologies and contributors.
 *
 * 此源代码的使用受 GNU AFFERO GENERAL PUBLIC LICENSE version 3 with Mamoe Exceptions 许可证的约束, 可以在以下链接找到该许可证.
 * Use of this source code is governed by the GNU AFFERO GENERAL PUBLIC LICENSE version 3 with Mamoe Exceptions license that can be found via the following link.
 *
 * https://github.com/mamoe/mirai/blob/master/LICENSE
 */

package net.mamoe.mirai.console.internal

import com.vdurmont.semver4j.Semver
import java.time.Instant

internal object MiraiConsoleBuildConstants { // auto-filled on build (task :mirai-console:fillBuildConstants)
    @JvmStatic
    val buildDate: Instant = Instant.ofEpochMilli(1597935352287L) // 2020-08-20 22:55:52

    @JvmStatic
    val version: Semver = Semver("1.0-M2-1")
}