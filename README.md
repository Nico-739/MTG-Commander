# MTG-Commander
An application to play the Commander game mode in MTG online with up to 4 people.

Alright — here’s a **full, clean commit naming convention guide** you can use for this project (and honestly for any Java + TypeScript project).
We’ll base it on the **Conventional Commits** standard, but with a few extra rules to keep your repo tidy and consistent.

---

## **1️⃣ Commit message format**

```
<type>(<scope>): <short summary>

[optional body]

[optional footer(s)]
```

### **Parts explained**

* **`<type>`** — what kind of change you made (see table below).
* **`<scope>`** — the area of the codebase affected (api, websocket, db, ui, docs, build, etc.).
* **`<short summary>`** — concise, imperative sentence (“add…”, “update…”, “fix…”).
* **Body** — optional; longer explanation of the change, why you did it, relevant context.
* **Footer** — optional; references to issues, breaking changes, etc.

---

## **2️⃣ Allowed `<type>` values**

| Type         | When to use it                                                  |
| ------------ | --------------------------------------------------------------- |
| **feat**     | A new feature for the app.                                      |
| **fix**      | A bug fix.                                                      |
| **docs**     | Documentation only changes (README, comments, guides).          |
| **style**    | Code style changes (formatting, indentation, no logic changes). |
| **refactor** | Code restructuring without changing behavior.                   |
| **perf**     | Performance improvement.                                        |
| **test**     | Adding or updating tests.                                       |
| **chore**    | Maintenance tasks, dependency bumps, build config changes.      |
| **build**    | Changes to build system or external dependencies (Maven, npm).  |
| **ci**       | Changes to CI/CD config or scripts.                             |

---

## **3️⃣ Example scopes for this project**

* **api** — REST API endpoints.
* **websocket** — STOMP/WebSocket-related code.
* **db** — Database entities, migrations, queries.
* **ui** — TypeScript frontend changes.
* **docs** — Documentation updates.
* **build** — Maven/Node build or tooling.
* **config** — App configuration changes.

---