<h1 align="center">About</h1>

The repository houses custom groovy scripts to be used in Jenkins Multibranch Pipeline projects. The functions deal with setting up python environment, making version commits, building and publishing docker image to DockerHub.

<h1 align="center"> Functions </h1>

<table align="center">
<thead>
<th>S.No</th>
<th>Function</th>
<th>Description</th>
<th>Arguments</th>
</thead>
<tbody>

<tr>
  <td>1</td>
  <td>makeEnv()</td>
  <td>Creates Virtual Environment</td>
  <td>-</td>
</tr>
<tr>
  <td>2</td>
  <td>activateEnv()</td>
  <td>Activates Virtual Environment</td>
  <td>-</td>
</tr>
<tr>
  <td>3</td>
  <td>installDependencies()</td>
  <td>Installs dependencies from requirements.txt file</td>
  <td>-</td>
</tr>
<tr>
  <td>4</td>
  <td>linter()</td>
  <td>Runs Flake8 linting, config in tox.ini</td>
  <td>-</td>
</tr>
<tr>
  <td>5</td>
  <td>testCases()</td>
  <td>Runs PyTest</td>
  <td>-</td>
</tr>
<tr>
  <td>6</td>
  <td>incrementVersion(type)</td>
  <td>Increments Version Specifiec in version.toml</td>
  <td>type: ["dev","stage","main"] corresponds to ["patch","minor","major"] updates</td>
</tr>
<tr>
  <td>7</td>
  <td>getVersion(filename)</td>
  <td>Returns Version specified in filename</td>
  <td>filename: String</td>
</tr>
<tr>
  <td>8</td>
  <td>makeupdatecommit(repo)</td>
  <td>Makes A Commit and Pushes to Github <repo></td>
  <td>repo: Repository To be Committed</td>
</tr>
<tr>
  <td>9</td>
  <td>buildDockerImage(version,repo)</td>
  <td>Builds docker image from dockerfile with name narayanadithya/<repo>/<version></td>
  <td>version: String, repo: String</td>
</tr>
<tr>
  <td>10</td>
  <td>dockerLogin()</td>
  <td>DockerHub Login</td>
  <td>-</td>
</tr>
<tr>
  <td>11</td>
  <td>dockerPush(version,repo)</td>
  <td>Pushes image to <repo> with tag <version></td>
  <td>version: String, repo: String</td>
</tr>
</tbody>
</table>
